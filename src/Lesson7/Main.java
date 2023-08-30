package Lesson7;

import java.util.Scanner;

import static Lesson7.Zoo.AnimalArray;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo Zoo1 = new Zoo(50);
        Zoo1.setAnimalArray();
        int x;
        do {
            System.out.println("Enter numbers");
            System.out.println("Enter 1 to show ALL ANIMALS IN ZOO");
            System.out.println("Enter 2 to feed ANIMALS");
            System.out.println("Enter 0 to EXIT");
            while (!scanner.hasNextInt()) {
                System.out.println("Enter number");
                scanner.next();
            }
            x = scanner.nextInt();
            switch (x) {
                case 1:
                    Zoo1.showAnimals();
                    break;
                case 2:
                    Zoo1.feadAnimals();
                    break;
                default:
            }
        }
        while (x != 0);
    }
}
