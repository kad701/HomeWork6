package Lesson7;

public abstract class Herbivores extends Animal{
    int wight;

    public Herbivores(int id, String animalType, int wight) {
        super(id, animalType);
        this.wight = wight;
    }
}
