package Lesson14_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // read text for edit
        FileReader reader = new FileReader("D://3hw-first.txt");
        StringBuilder builder = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            builder.append((char) c);
        }
        reader.close();
        String[] sentences = builder.toString().split("[.;!?=]+");
        System.out.println(Arrays.toString(sentences));

        // read special words
        FileReader readerWords = new FileReader("D://3hw-second.txt");
        StringBuilder builderWords = new StringBuilder();
        while ((c = readerWords.read()) != -1) {
            builderWords.append((char) c);
        }
        reader.close();


        String[] specialWords = builderWords.toString().split(" ");
        System.out.print(Arrays.toString(specialWords));
        int counter = 0;
        System.out.println();
        ArrayList<String>notGoodSentences=new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("-----------------");
        int temp=0;
        for (String sentence :
                sentences) {
            String[] words = sentence.trim().split("[\\s,]+");
            System.out.println(Arrays.toString(words));
            for (String sW :
                    specialWords) {
                temp=counter;
                System.out.println(sW);
                for (String word :
                        words) {
                    if (sW.equals(word)) {
                        counter++;
                        notGoodSentences.add(Arrays.toString(words));
                        break;
                    }
                }
                if(temp!=counter)
                    break;
            }

        }
        if (counter == 0)
            System.out.println("No Bad words, everything is good");
        else {
            System.out.println("There are Bad words here");
            System.out.println("IT is " + counter+" sentences with Bad words");
            System.out.println("here they are");
            System.out.println(notGoodSentences);
        }
    }
}
