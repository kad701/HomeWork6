package Lesson7;

import java.util.Scanner;

import static Lesson7.Zoo.AnimalArray;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cell amount");
        int cAmaunt= scanner.nextInt();
        Zoo Zoo1 = new Zoo();
        AnimalArray = new Animal[cAmaunt];
        Zoo1.setAnimalArray();
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
                    Zoo1.showAnimals();
                    break;
                case 2:
                    Zoo1.feadAnimals();
                    break;
                default:
            }
        }
        while (menuOption != 0);
    }
}
