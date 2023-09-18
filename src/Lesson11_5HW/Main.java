package Lesson11_5HW;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter string of numbers");
        String numberString=scanner.nextLine();
        System.out.println("you are entered "+numberString);
        HashSet<Character> numberSet=new HashSet<Character>();
      char [] charArray = numberString.toCharArray();
        System.out.println(charArray);
        for (int i = 0; i < charArray.length; i++) {
            numberSet.add(charArray[i]);
        }
        System.out.println(numberSet);
    }
}
