package Lesson7;

public class Antiloppe extends Herbivores{
    int maxSpeed;

    public Antiloppe(int id, String animalType, int wight, int maxSpeed) {
        super(id, animalType, wight);
        this.maxSpeed = maxSpeed;
    }
    public int getAnimalId() {
        return id;
    }

    public String getAnimalType() {
        return "Antiloppe";
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
                System.out.println("Worms hmm maybe with a grass");
                break;
            case 4:
                System.out.println(" Seads hmm maybe");
                break;
            case 5:
                System.out.println("I can eat fruits a little");
                break;
            default:
                System.out.println("no food type");

        }

    }
}
