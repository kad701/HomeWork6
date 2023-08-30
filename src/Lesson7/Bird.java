package Lesson7;

public abstract class Bird extends Animal{
    String cellSize;
    int wingSize;

    public Bird(int id, String animalType, String cellSize, int wingSize) {
        super(id, animalType);
        this.cellSize = cellSize;
        this.wingSize = wingSize;
    }

    abstract void feedAnimal(int foodType);
}
