package animalShelter;

public class Animal {

    private String name;
    private int age;
    private String sex;
    private int daysInRescue;
    private static int animalCounter;

    protected Animal(String name, int age, String sex, int daysInRescue){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.daysInRescue = daysInRescue;
        animalCounter++;
    }

    public String getName(){
        return name;
    }
    protected void setName(String name){
        this.name =  name;
    }

    public int getAge(){
        return age;
    }

    protected void setAge(int age){
        this.age =  age;
    }

    public String getSex(){
        return sex;
    }

    protected void setSex(String sex){
        this.sex = sex;
    }

    public int daysInRescue(){
        return daysInRescue;
    }

    protected void setDaysInRescue(int daysInRescue){
        this.daysInRescue =  daysInRescue;
    }

    public String toString(){
        return "Name: " + name + "\nAge: " + age +"\nDays in rescue: " + daysInRescue +"\n";
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Rex", 2, "male", 3);
        System.out.println(animal);
    }

    
}
