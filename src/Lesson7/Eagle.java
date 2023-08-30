package Lesson7;

public class Eagle extends Bird{
    int maxSpeed;           // максимальная скорость полета

    public Eagle(String animalType, int id, String cellSize, int wingSize, int maxSpeed) {
        super(id, animalType, cellSize, wingSize);
        this.maxSpeed = maxSpeed;
    }
    public String getAnimalType() {
        return "Eagle" ;
    }
    public int getAnimalId() {
        return id;
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
                System.out.println("Worms is ok sometimes, but ONLy sometimes");
                break;
            case 4:
                System.out.println("NO Seads");
                break;
            case 5:
                System.out.println("No fruits");
                break;
            default:
                System.out.println("no food type");

        }


    }



}
