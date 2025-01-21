public class Cat {

    String name;
    String sex;
    int age;
    int daysInRescue;
    boolean adopted;
    
    public Cat(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public static void main(String[] args){

        Cat cat1 = new Cat("Sesame", "female", 3);
        Cat cat2 = new Cat("Mochi", "unknown", 1);
        cat1.daysInRescue = 3;
        cat2.daysInRescue = 47;
        cat2.adopted = true;
    }

}
