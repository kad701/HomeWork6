package Lesson7;

public abstract class Animal {
    int id;
    String animalType;
    static int amount=0;
    abstract void feedAnimal(int foodType);

    public Animal(int id, String animalType) {
        this.id = id;
        this.animalType = animalType;
    }

    abstract public int getAnimalId();


    static   void getAnimalAmount(){
        for (int i = 0; i < Zoo.AnimalArray.length; i++) {
            if(Zoo.AnimalArray[i].getAnimalId() != 0) {
                amount++;
            }
        }
        System.out.println("Колтчество животных = "+amount);
    }

    public  abstract String getAnimalType();

}
