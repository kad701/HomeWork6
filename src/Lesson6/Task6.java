package Lesson6;

import java.util.Scanner;

public class Task6 {

    static Scanner scanner=new Scanner(System.in);
    static String s="";
    static String div="";
    public static  void task6(){
        System.out.println("Введите строку");
        s =scanner.nextLine();
        System.out.println("Введите разделитель");
        div=scanner.nextLine();
        String [] words=s.split(div);
        for (String s:
             words) {
            System.out.print(s+" ");

        }


        }
    }

