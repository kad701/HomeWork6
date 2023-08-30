package Lesson7;

public class Wolf extends Predator{
    String status;

    public Wolf(int id, String animalType, String cellSize, String status) {
        super(id, animalType, cellSize);
        this.status = status;
    }

    @Override
    void feedAnimal(int foodType) {
        switch (foodType){
            case 1:
                System.out.println("i  like fresh meat");
                break;
            case 2:
                System.out.println("i dont eating Grass");
                break;
            case 3:
                System.out.println("Worms is no GOOD, but if i very hungry i can eat that");
                break;
            case 4:
                System.out.println("i don't eat Seads");
                break;
            case 5:
                System.out.println("no Fruits");
                break;
            default:
                System.out.println("no food type");

        }
    }

    public int getAnimalId(){
        return id;
    }
   public String getAnimalType(){
        return animalType;
   }
}
