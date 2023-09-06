package Lesson9_3;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            ExeptionClassMethod.exeptionClassMethod();
        } catch (FileNotFoundException exception) {
            System.out.println("EXEption FileNotFoundException");
        } catch (NullPointerException exception) {
            System.out.println("EXEption NullPointerException");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
