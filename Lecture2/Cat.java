public class Cat {

    private String name;
    private String sex;
    private int age;
    private int daysInRescue;
    private boolean adopted;
    private static int totalCats;

    public Cat(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
        totalCats++;
    }
    @Override
    public String toString(){
        return "Cat " + this.name + " is adopted? " + this.adopted;
    }

    public int getDaysInRescue(){
        return this.daysInRescue;
    }

    protected void setDaysinRescue(int days){
        this.daysInRescue = days;
    }

    public void adopt(){
        this.adopted = true;
        totalCats--;
    }
    public static void main(String[] args){

        Cat cat1 = new Cat("Sesame", "female", 3);
        cat1.adopt();
        System.out.println(cat1);
        System.out.println(Cat.totalCats);

        Cat cat2 = new Cat("orange", "male", 12);
        cat2.setDaysinRescue(20);
        System.out.println(cat2.getDaysInRescue());

    }
}
