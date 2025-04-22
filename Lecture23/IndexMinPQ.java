import java.util.*;

public class IndexMinPQ<Key extends Comparable<Key>> {
    private final int maxN;
    private int N;
    private final int[] pq;
    private final int[] qp;
    private final Key[] keys;

    @SuppressWarnings("unchecked")
    public IndexMinPQ(int maxN) {
        this.maxN = maxN;
        keys = (Key[]) new Comparable[maxN];
        pq = new int[maxN + 1];
        qp = new int[maxN];
        Arrays.fill(qp, -1);
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean contains(int i) {
        return qp[i] != -1;
    }

    public void insert(int i, Key key) {
        N++;
        qp[i] = N;
        pq[N] = i;
        keys[i] = key;
        swim(N);
    }

    public void decreaseKey(int i, Key key) {
        keys[i] = key;
        swim(qp[i]);
    }

    public int delMin() {
        int min = pq[1];
        exch(1, N--);
        sink(1);
        qp[min] = -1;
        keys[min] = null;
        pq[N + 1] = -1;
        return min;
    }

    private void swim(int k) {
        while (k > 1 && greater(k / 2, k)) {
            exch(k, k / 2);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && greater(j, j + 1)) j++;
            if (!greater(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

    private boolean greater(int i, int j) {
        return keys[pq[i]].compareTo(keys[pq[j]]) > 0;
    }

    private void exch(int i, int j) {
        int swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
        qp[pq[i]] = i;
        qp[pq[j]] = j;
    }
}
