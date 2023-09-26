package Lesson14_2LastVersion;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class TextFormatter {         // read from file
    public static String readTextFromFile(String str) throws IOException {
        FileReader reader = new FileReader(str);
        StringBuilder builder = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            builder.append((char) c);
        }
        reader.close();
        return builder.toString();
    }


    public static void writeInFile(String string) throws IOException {    //write in file
        FileWriter writer = new FileWriter("D://hw2_2.txt");
        writer.write(string);
        writer.close();
    }

    public static int wordsAmount(String string) {
        String[] words = string.trim().split("[\\s,.!?]+");
        return words.length;
    }

    public static boolean isPolindrome(String string) {
        String[] words = string.trim().split("[\\s,.!?]+");
        System.out.println(Arrays.toString(words));
        int counteer = 0;
        for (String word :
                words) {
            StringBuilder stringBuilder = new StringBuilder(word);
            stringBuilder.reverse();
            if (stringBuilder.toString().equals(word))
                counteer++;
        }
        if (counteer > 0)
            return true;
        else
            return false;
    }

}
