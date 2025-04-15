import java.util.Arrays;

public class QuickSort {

    //helper method that sorts subarray from lo to hi
    private static <E extends Comparable<E>> void quickSort(E[] a, int lo, int hi) {
        if (lo < hi){
            int pivot = partition(a, lo, hi);
            System.out.print("next pivot is going to be " + pivot + "------ \n");
            quickSort(a, lo, pivot - 1);
            quickSort(a, pivot + 1, hi);
        }

    }

    /*
     * Rearranges the array in ascending order, using the natural order.
     * @param a array to be sorted
     */
    public static <E extends Comparable<E>> void quickSort(E[] a) {
        quickSort(a, 0, a.length - 1);
    }

    // choose leftmost element as piv
    private static <E extends Comparable<E>> int partition(E[] a, int lo, int hi) {
        E pivot = a[lo]; // Choose leftmost element as pivot
        int i = lo + 1; // Start from the next element
        int j = hi;
    
        while (true) {
            // Move right until we find an element >= pivot
            while (i <= j && a[i].compareTo(pivot) <= 0) {
                i++;
            }
            // Move left until we find an element < pivot
            while (j >= i && a[j].compareTo(pivot) > 0) {
                j--;
            }
            // If pointers cross, break
            if (i > j) {
                break;
            }

            // Swap elements to ensure correct partitioning
            E temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            System.out.print("swapped " + a[i] + " and " + a[j] + "\n");
            System.out.print("i " + i + ", j " + j + "\n");

        }


        // Swap pivot into its correct position
        E temp = a[lo];
        a[lo] = a[j];
        a[j] = temp;
        System.out.print("pivot swapped values " + a[lo] + " and " + a[j] + "\n");
        System.out.print("pivot is i " + i + " and j " + j + " for array " + Arrays.toString(a) + "\n");
        

        return j; // Return final pivot position
    }

    public static <E extends Comparable<E>> void printArray(E[] a) {
        for (E item : a) {
            System.out.print(item + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Integer[] array1 = {4, 1, 9,3,8,2};
		System.out.println(Arrays.toString(array1));
        quickSort(array1);
		System.out.println(Arrays.toString(array1));

        // Integer[] array2 = { 5, 3, 6, 2, 4, 0, 4 };
		// System.out.println(Arrays.toString(array2));
        // quickSort(array2);
		// System.out.println(Arrays.toString(array2));
    }
}
