import java.util.ArrayList;

class Box<T> {
    private ArrayList<T> items = new ArrayList<T>();

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem(int index) {
        return items.get(index);
    }

    public void removeItem(int index) {
        items.remove(index);
    }

    public int getSize() {
        return items.size();
    }
}

public class WithGenerics {
    public static void main(String[] args) {
        Box<String> fruitBox = new Box<>(); //optionally, new Box<String>();
        fruitBox.addItem("Grape");
        fruitBox.addItem("Banana");

        Box<Double> weightBox = new Box<>(); //optionally, new Box<Double>();
        weightBox.addItem(10.0);
        weightBox.addItem(12.5);
        weightBox.addItem(25.0);
        weightBox.removeItem(0);

        System.out.println(fruitBox.getSize());
        System.out.println(weightBox.getItem(1));
    }
}
