package Lesson7;

public class Tiger extends Predator{
    int age;

    public Tiger(int id, String animalType, String cellSize, int age) {
        super(id, animalType, cellSize);
        this.age = age;
    }

    void feedAnimal(int foodType) {
        switch (foodType){
            case 1:
                System.out.println("i  like fresh meat");
                break;
            case 2:
                System.out.println("i dont eating Grass");
                break;
            case 3:
                System.out.println("Worms is no GOOD");
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
