package Lesson11_Journal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WorkClass {
    static HashMap<Student,ArrayList<String>> slMap=new HashMap<>();

    public static void addStudent(String name,int lessonsAmount){
       slMap.put(new Student(name),Lesson.fillLesson(lessonsAmount));
    }

    public static void showTable(){
        System.out.println(slMap.toString());
    }
    public static void remove(int removeId){

        slMap.remove(Student.getStudentByName(removeId));
    }


}
