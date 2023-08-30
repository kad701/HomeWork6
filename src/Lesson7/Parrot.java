package Lesson7;

public class Parrot extends Bird{

    String name;
    int knownWordsAmount;             //сколько слов знает


    public String getName() {
        return name;
    }

    public Parrot(String animalType, int id, String cellSize, int wingSize, String name, int knownWordsAmount) {
        super(id, animalType, cellSize, wingSize);
        this.name = name;
        this.knownWordsAmount = knownWordsAmount;
    }

    public int getAnimalId() {
        return id;
    }

    public String getAnimalType() {
        return "Parrot";
    }

    void feedAnimal(int foodType){
        switch (foodType){
            case 1:
                System.out.println("i dont like fresh meat");
                break;
            case 2:
                System.out.println("i dont eating Grass");
                break;
            case 3:
                System.out.println("Worms is GOOD");
                break;
            case 4:
                System.out.println("i like Seads");
                break;
            case 5:
                System.out.println("I can try fruits a little");
                break;
            default:
                System.out.println("no food type");

        }

    }


}
