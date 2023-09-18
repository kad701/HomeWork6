package Lesson11_7HW;

import java.util.ArrayList;

public class Animals {
    public String animalName;

    public Animals(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return animalName;
    }

    public static void deleteAnimal(ArrayList<Animals> aL) {
        aL.remove(0);

    }
}
