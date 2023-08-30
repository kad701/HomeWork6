package Lesson7;

public abstract class Predator extends Animal {

    String cellSize;

    public Predator(int id, String animalType, String cellSize) {
        super(id, animalType);
        this.cellSize = cellSize;
    }

    abstract public int getAnimalId();
    public  abstract String getAnimalType();
}
