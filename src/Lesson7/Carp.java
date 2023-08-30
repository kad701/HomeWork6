package Lesson7;

public class Carp extends Fish {
    int weight;

    public Carp(int id, String animalType, String waterType, int weight) {
        super(id, animalType, waterType);
        this.weight = weight;
    }
    public int getAnimalId() {
        return id;
    }

    public String getAnimalType() {
        return "Carp";
    }
    void feedAnimal(int foodType){
        switch (foodType){
            case 1:
                System.out.println("i  dont like fresh meat");
                break;
            case 2:
                System.out.println("i dont eating Grass");
                break;
            case 3:
                System.out.println("Worms is GOOD");
                break;
            case 4:
                System.out.println("i can try Seads");
                break;
            case 5:
                System.out.println("No Fruits");
                break;
            default:
                System.out.println("no food type");

        }

    }
}
