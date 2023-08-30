package Lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cell amount");
        int cAmaunt = scanner.nextInt();
        Zoo zooMinsk = new Zoo();
        zooMinsk.setAnimals(new Animal[cAmaunt]);
        zooMinsk.setAnimalArray();
        int menuOption;
        do {
            System.out.println("Enter numbers");
            System.out.println("Enter 1 to show ALL ANIMALS IN ZOO");
            System.out.println("Enter 2 to feed ANIMALS");
            System.out.println("Enter 0 to EXIT");
            while (!scanner.hasNextInt()) {
                System.out.println("Enter number");
                scanner.next();
            }
            menuOption = scanner.nextInt();
            switch (menuOption) {
                case 1:
                    zooMinsk.showAnimals();
                    break;
                case 2:
                    zooMinsk.feadAnimals();
                    break;
                default:
            }
        }
        while (menuOption != 0);
    }
}
