package Lesson11_Journal;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson {

   static ArrayList<String> fillLesson(int lessonAmount){
       Scanner scanner=new Scanner(System.in);
       ArrayList<String > lessonList=new ArrayList<>();
       for (int i = 0; i < lessonAmount; i++) {
           System.out.println("enter lesson number  = "+i);
           lessonList.add(scanner.nextLine());
       }
       return lessonList;
   }


}
