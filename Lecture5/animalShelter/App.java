package animalShelter;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("Rex", 15, 0);
        System.out.println(animal.makeHappyNoise());
        Dog dog = new Dog("Cody", 2, 3, "German Shepherd");
        System.out.println(dog.makeHappyNoise());
        Cat cat = new Cat("Fluffy", 2, 3, "long");
        System.out.println(cat.makeHappyNoise());
        Animal dogAnimal = new Dog("Blaze", 3, 20, "Bulldog");
        System.out.println(dogAnimal.makeHappyNoise());
        Animal catAnimal = new Cat("Dune", 2, 11, "short");
        System.out.println(catAnimal.makeHappyNoise());


    }
}
