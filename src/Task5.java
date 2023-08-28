import java.util.Scanner;

public class Task5 {

    static String[] str = new String[3];
    static int count = 0;

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите строку " + (i + 1));
            str[i] = scanner.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            Task5.isNumbers(str[i]);
        }
    }

    public static void isNumbers(String s) {
        if (s.matches("-?[0-9]+")) {
            Task5.isPolindrom(s);
        }
    }

    public static void isPolindrom(String s) {
        int k = 0;
        char[] ch = new char[s.length()];
        s.getChars(0, s.length(), ch, 0);
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ch[ch.length - 1 - i]) {
                k++;
            }
        }
        if (k == 0) {
            count++;
            if (count == 2) {
                System.out.println("Полиндром " + s);
            }
        }
    }

}
