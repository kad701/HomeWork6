package Lesson11_Journal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static Lesson11_Journal.WorkClass.slMap;

public class Student {
    private int id;
    private String name;
    public static int counter=0;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.id = counter++;
        this.name = name;
    }


    public static Student getStudentByName( int id) {
        for (Map.Entry<Student, ArrayList<String>> entry : slMap.entrySet()) {
            Student student = entry.getKey();
            if (student.getId()==id) {
                return student;
            }
        }
        return null;
    }
}




