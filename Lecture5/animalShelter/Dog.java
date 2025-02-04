package animalShelter;

public class Dog extends Animal{

    private String breed;    
    private static int dogCounter;

    public Dog(String name, int age, int daysInRescue, String breed){
        super(name, age, daysInRescue);
        this.breed = breed;
        dogCounter++;
    }

    public String toString(){
        return super.toString()+ "Dog breed: " + breed + "\n";
    }

    public String makeHappyNoise(){
        return "I am a happy dog!";
    }
}