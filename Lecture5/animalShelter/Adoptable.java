package animalShelter;

public interface Adoptable {
    void requestAdoption();  // Method to initiate the adoption process
    boolean isAdopted();     // Method to check if the animal has been adopted
    void completeAdoption(); // Method to finalize the adoption
    String makeHappyNoise();   // Method that returns a happy noise the adopted animal makes
}
