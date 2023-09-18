package Lesson11_1HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of students");
        int amountStudents = scanner.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Enter lessons amount");
        int amountLesoons = scanner.nextInt();
        ArrayList<String> lessonList = new ArrayList<>();
        for (int i = 0; i < amountStudents; i++) {
            System.out.println("Enter student " + i + " name");
            String name = scanner.next();
            for (int j = 0; j < amountLesoons; j++) {
                System.out.println("student " + i + " lesson " + j + "true or faulse");
                String s = scanner.next();
                lessonList.add(s);

            }
            students.add(new Student(i , name, lessonList));
            System.out.println(students);
            lessonList.clear();
        }



    }
}
