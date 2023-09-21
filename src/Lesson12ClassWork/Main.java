package Lesson12ClassWork;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(SuperHero.values()));
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number 1-SpyderMan, 2-SyperMan,3-CaptanAmerica");
        SuperHero sH;
        int k = scanner.nextInt();
        switch (k) {
            case 1:
                sH = SuperHero.SpyderMan;
                System.out.println(sH.getSuperPower());
                break;
            case 2:
                sH = SuperHero.SyperMan;
                System.out.println(sH.getSuperPower());
                break;
            case 3:
                sH = SuperHero.CaptanAmerica;
                System.out.println(sH.getSuperPower());
                break;
        }

        SuperHero.CaptanAmerica.fight(SuperHero.SyperMan);
    }
}
