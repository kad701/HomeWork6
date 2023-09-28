package Lesson11_Journal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("MENU");
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("0-EXIT; 1-Add a student;  2-remove student;  3-show table");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("enter student name");
                    String name=scanner.next();
                    System.out.println("enter lessons amount");
                    int lessonsAmount= scanner.nextInt();
                   WorkClass.addStudent(name,lessonsAmount);
                    break;
                case 2:
                    System.out.println("Id student need to remove");
                    int removeID= scanner.nextInt();
                    WorkClass.remove(removeID);
                    break;
                case 3:
                    System.out.println("show table");
                    WorkClass.showTable();
                case 0:
                    break;

                default:
                    System.out.println("wrong option try again");
            }

        } while (option != 0);
    }
}
