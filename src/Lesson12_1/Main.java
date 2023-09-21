package Lesson12_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of Birth");
        int day = scanner.nextInt();
        System.out.println("Enter mounth of Birth");
        int mounth = scanner.nextInt();
        switch (mounth) {
            case 1:
                if (day >= 21)
                    System.out.println(ZodiacSign.AQUARIUS);
                else System.out.println(ZodiacSign.CAPRICOM);
                break;
            case 2:
                if (day >= 20)
                    System.out.println(ZodiacSign.PISCES);
                else System.out.println(ZodiacSign.AQUARIUS);
                break;
            case 3:
                if (day >= 21)
                    System.out.println(ZodiacSign.ARIES);
                else System.out.println(ZodiacSign.PISCES);
                break;
            case 4:
                if (day >= 21)
                    System.out.println(ZodiacSign.TAURUS);
                else System.out.println(ZodiacSign.ARIES);
                break;
            case 5:
                if (day >= 22)
                    System.out.println(ZodiacSign.GEMINI);
                else System.out.println(ZodiacSign.TAURUS);
                break;
            case 6:
                if (day >= 22)
                    System.out.println(ZodiacSign.CANCER);
                else System.out.println(ZodiacSign.GEMINI);
                break;
            case 7:
                if (day >= 22)
                    System.out.println(ZodiacSign.LEO);
                else System.out.println(ZodiacSign.CANCER);
                break;
            case 8:
                if (day >= 23)
                    System.out.println(ZodiacSign.VIRGO);
                else System.out.println(ZodiacSign.LEO);
                break;
            case 9:
                if (day >= 22)
                    System.out.println(ZodiacSign.LIBRA);
                else System.out.println(ZodiacSign.VIRGO);
                break;
            case 10:
                if (day >= 24)
                    System.out.println(ZodiacSign.SCORPIO);
                else System.out.println(ZodiacSign.LIBRA);
                break;
            case 11:
                if (day >= 21)
                    System.out.println(ZodiacSign.SAGITTARIUS);
                else System.out.println(ZodiacSign.SCORPIO);
                break;
            case 12:
                if (day >= 23)
                    System.out.println(ZodiacSign.CAPRICOM);
                else System.out.println(ZodiacSign.SAGITTARIUS);
                break;
        }
    }
}
