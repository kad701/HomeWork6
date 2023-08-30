package Lesson7;

public class Shark extends Fish{
    int size;

    public Shark(int id, String animalType, String waterType, int size) {
        super(id, animalType, waterType);
        this.size = size;
    }
    public int getAnimalId() {
        return id;
    }

    public String getAnimalType() {
        return "Shark";
    }
    void feedAnimal(int foodType){
        switch (foodType){
            case 1:
                System.out.println("i  like fresh meat");
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
