package Lesson11_7HW;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animals> animalsList = new ArrayList<>();
        animalsList.add(new Animals("pig"));
        animalsList.add(new Animals("dunky"));
        animalsList.add(new Animals("hourse"));
        animalsList.add(new Animals("chicken"));
        animalsList.add(new Animals("dog"));
        System.out.println(animalsList.toString());

        Animals.deleteAnimal(animalsList);
        System.out.println(animalsList.toString());
        Animals.deleteAnimal(animalsList);
        System.out.println(animalsList.toString());
        animalsList.add(new Animals("pig"));
        System.out.println(animalsList.toString());
    }
}
