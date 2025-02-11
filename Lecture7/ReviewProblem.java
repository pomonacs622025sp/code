import java.util.ArrayList;

interface Storable {
    String getName();
    double getPrice();
}
class Product implements Storable {
    private String name;
    private double price; 
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){return name;}
    public double getPrice(){return price;}
}
class Inventory<E extends Storable> {
    private ArrayList<E> items = new ArrayList<>();

    public void addItem(E item) {
        items.add(item);
    }

    public void removeItem(E item) {
        items.remove(item);
    }

    public void showInventory() {
        System.out.println("Inventory contains:");
        for (E item : items) {
            System.out.println("- " + item.getName());
        }
    }
}

public class ReviewProblem {
    public static void main(String[] args) {
        Inventory<Product> warehouse = new Inventory<>();
        Product laptop = new Product("laptop", 1999.99);
        warehouse.addItem(laptop);
        warehouse.addItem(new Product("shirt", 24.99));
        warehouse.showInventory(); 
        warehouse.addItem(new Product("headphones", 50.00));
        warehouse.showInventory(); 
        warehouse.removeItem(laptop);
        warehouse.showInventory(); 
    }
}
