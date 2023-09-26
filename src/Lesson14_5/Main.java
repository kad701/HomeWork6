package Lesson14_5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("D://14-romeo-and-juliet.txt");
        StringBuilder builder = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            builder.append((char) c);
        }
        reader.close();
        String[] words = builder.toString().split("[\\s,.;!?=]+");
        int size=0;
        StringBuilder str = null;
        for (String word:
             words) {
           if(word.length()>size) {
               size = word.length();
               str=new StringBuilder(word);
           }
        }
        System.out.println(str);

        FileWriter writer = new FileWriter("D://hw5.txt");
        writer.write(String.valueOf(str));
        writer.close();

    }

}
