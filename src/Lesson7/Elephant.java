package Lesson7;

public class Elephant extends Herbivores{
    int noseSize;

    public Elephant(int id, String animalType, int wight, int noseSize) {
        super(id, animalType, wight);
        this.noseSize = noseSize;
    }
    public int getAnimalId() {
        return id;
    }

    public String getAnimalType() {
        return "Elephant";
    }

    void feedAnimal(int foodType){
        switch (foodType){
            case 1:
                System.out.println("i dont like fresh meat");
                break;
            case 2:
                System.out.println("i Love Grass, eating all the time");
                break;
            case 3:
                System.out.println("Worms i dont care");
                break;
            case 4:
                System.out.println(" Seads hmm sure");
                break;
            case 5:
                System.out.println("Fruits is good");
                break;
            default:
                System.out.println("no food type");

        }

    }
}
