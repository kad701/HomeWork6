package Lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human spiderMan=new Human();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter human name");
        spiderMan.setName(scanner.next());
        System.out.println("Enter human age");
        spiderMan.setAge(scanner.nextInt());

        spiderMan.breathingINWater();
        spiderMan.teleporting();
        spiderMan.flying();
        System.out.println(spiderMan.toString());
        System.out.println(spiderMan.hashCode());




    }
}
