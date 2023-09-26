package Lesson14_1HW;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.text;


public class Main {
    public static <FileOutputStream> void main(String[] args) throws IOException {
        File file = new File("D://hw1.txt");
        System.out.println(file.exists() ? "File hw1.txt exists" : "File hw1.txt not found");
        String filePath = "D://hw1.txt";
        Path path = Paths.get(filePath);
        ArrayList<String> lines = new ArrayList<>(Files.readAllLines(path, StandardCharsets.UTF_8));
        System.out.println(lines);
        ArrayList<String> newLines = new ArrayList<>();
        for (String str :
                lines) {
            StringBuilder stringBuilder = new StringBuilder(str);
            StringBuilder stringBuilderFlip = new StringBuilder(str);
            stringBuilderFlip.reverse();
            System.out.println(stringBuilderFlip + " " + stringBuilder);
            if (stringBuilderFlip.compareTo(stringBuilder) == 0) {
                newLines.add(String.valueOf(stringBuilder));
            }
        }
        System.out.println(newLines);
        FileWriter writer = new FileWriter("D://new1HW.txt");
        writer.write(String.valueOf(newLines));
        writer.close();

    }
}
