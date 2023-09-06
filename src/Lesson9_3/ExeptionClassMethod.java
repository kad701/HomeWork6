package Lesson9_3;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class ExeptionClassMethod {
    public static void exeptionClassMethod() throws Exception {
        int i = (int) (Math.random() * 4)+1;
        System.out.println(i);
        switch (i) {
            case 1:
                throw new NullPointerException();
            case 2:
                throw new FileNotFoundException();
            case 3:
             throw new ArithmeticException();

        }
    }
}
