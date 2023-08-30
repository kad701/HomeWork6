package Lesson7;

public abstract class Fish extends Animal{
    String waterType;

    public Fish(int id, String animalType, String waterType) {
        super(id, animalType);
        this.waterType = waterType;
    }
}
