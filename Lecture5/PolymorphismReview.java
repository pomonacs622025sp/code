class Parent {
    int num = 10;

    public void show() {
        System.out.println("Parent show() method");
    }
}

class Child extends Parent {
    int num = 20; // Hides parent's 'num'

    @Override
    public void show() {
        System.out.println("Child show() method");
    }
}

public class PolymorphismReview {
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.println(obj.num);
        obj.show();
    }
}
