package ProjectDemo;

import java.io.Serializable;
import java.util.Scanner;

public class Service implements Serializable {

    public static int enterInt() {
        Scanner scanner = new Scanner(System.in);
        int x = -1;
        System.out.println("Enter a number");
        while (!scanner.hasNextInt()) {
            System.out.println("mistake,enter a number");
            scanner.next();
        }
        x = scanner.nextInt();
        return x;
    }

    public static String enterString() {
        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();

    }


}
