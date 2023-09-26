package Lesson14_2LastVersion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String textFromFile = TextFormatter.readTextFromFile("D://hw2.txt"); /// read text from file
        System.out.println(textFromFile);
        char[] charText = textFromFile.toCharArray();
        ArrayList<Integer> endSentencesIndex = new ArrayList<>();
        endSentencesIndex.add(0);
        for (int i = 0; i < charText.length; i++) {
            if (charText[i] == '.' || charText[i] == '!' || charText[i] == '?')
                endSentencesIndex.add(i);
        }
        System.out.println(endSentencesIndex);

        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < endSentencesIndex.size() - 1; i++) {
            counter = 0;
            int length = endSentencesIndex.get(i + 1) - endSentencesIndex.get(i);

            if (i == 0)
                counter = TextFormatter.wordsAmount(new String(charText, endSentencesIndex.get(i), length).trim());
            else
                counter = TextFormatter.wordsAmount(new String(charText, endSentencesIndex.get(i) + 1, length).trim());
            if (counter >= 3 && counter <= 5)
                stringBuilder.append(new String(charText, endSentencesIndex.get(i), length).trim());
            else if (i == 0) {
                if (TextFormatter.isPolindrome(new String(charText, endSentencesIndex.get(i), length).trim()))
                    stringBuilder.append(new String(charText, endSentencesIndex.get(i), length).trim());

            } else if (TextFormatter.isPolindrome(new String(charText, endSentencesIndex.get(i) + 1, length).trim()))
                stringBuilder.append(new String(charText, endSentencesIndex.get(i), length + 1).trim());
            TextFormatter.writeInFile(stringBuilder.toString());

        }
    }
}
