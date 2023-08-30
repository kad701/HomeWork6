package Lesson7;

import java.util.Scanner;

public class Zoo {
    static public int cageAmount;
    static public Animal[] AnimalArray;


    Scanner scanner = new Scanner(System.in);

    public void setAnimalArray() {
        int counter;
        ////////// enter Animals
        for (int idAnimal = 0; idAnimal < AnimalArray.length; idAnimal++) {
            counter = (int) (Math.random() * 8 + 1);
            switch (counter) {
                case 1:
                    AnimalArray[idAnimal] = new Parrot("Parrot", idAnimal, "cellSize", 15, "Gosha", 25);
                    break;
                case 2:
                    AnimalArray[idAnimal] = new Eagle("Eagle", idAnimal, "cellSize", 15, 25);
                    break;
                case 3:
                    AnimalArray[idAnimal] = new Tiger(idAnimal, "Tiger", "cellSize", 15);
                    break;
                case 4:
                    AnimalArray[idAnimal] = new Wolf(idAnimal, "Wolf", "cellSize", "Leader");
                    break;
                case 5:
                    AnimalArray[idAnimal] = new Elephant(idAnimal, "Elephant", 1000, 5);
                    break;
                case 6:
                    AnimalArray[idAnimal] = new Antiloppe(idAnimal, "Antiloppe", 80, 89);
                    break;
                case 7:
                    AnimalArray[idAnimal] = new Shark(idAnimal, "Shark", "sault water", 15);
                    break;
                case 8:
                    AnimalArray[idAnimal] = new Carp(idAnimal, "Carp", "fresh water", 15);
                    break;
                default:
            }
        }


    }


    ///////////////////////////////////////// feed Animals
    public void feadAnimals() {
        //  AnimalArray[0].getAnimalAmount();
        System.out.println("LETS feed Animals");
        int feedCounter = 10;
        while (feedCounter != 0) {
            System.out.println("What Animal do you want to feed enter id ");
            int idAnimal = scanner.nextInt();
            //  AnimalArray[idAnimal].getAnimalAmount();
            System.out.println(AnimalArray[idAnimal].getAnimalType());


            System.out.print("1 for fresh meat   ");
            System.out.print(" 2 for Grass    ");
            System.out.print("3 for Worms    ");
            System.out.print("4 for Seads     ");
            System.out.print("5 for Fruits   ");
            System.out.print("0 for EXIT    ");
            feedCounter = scanner.nextInt();

            switch (feedCounter) {
                case 1:
                    AnimalArray[idAnimal].feedAnimal(1);
                    break;
                case 2:
                    AnimalArray[idAnimal].feedAnimal(2);
                    break;
                case 3:
                    AnimalArray[idAnimal].feedAnimal(3);
                    break;
                case 4:
                    AnimalArray[idAnimal].feedAnimal(4);
                    break;
                case 5:
                    AnimalArray[idAnimal].feedAnimal(5);
                    break;
                default:
                    System.out.println("NO food type");
            }

        }


    }

    public void showAnimals() {
        for (int i = 0; i < AnimalArray.length; i++) {
            System.out.print(AnimalArray[i].getAnimalType() + " ");
            if (i % 10 == 0)
                System.out.println();
        }
    }

}
