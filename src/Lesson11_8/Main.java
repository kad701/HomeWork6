package Lesson11_8;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> components = new HashMap<>();
        components.put("1-milk", 20);
        components.put("2-syrup", 25);
        components.put("3-coffe", 15);
        components.put("4-cream", 25);
        components.put("5-sugar", 2);
        components.put("6-cinnamon", 10);
        components.put("7-mint", 5);
        components.put("8-lime", 5);
        components.put("9-juice", 20);
        System.out.println("create your own drink");
        int price = 0;
        int k = 0;
        do {
            System.out.println("Options for your drink");
            System.out.println("PRESS 1-milk,2-syrup,3-coffe,4-cream,5-sugar,6-cinnamon,7-mint,8-lime,9-juice,0-EXIT");
            k = scanner.nextInt();
            switch (k) {
                case 1:
                    price = price + components.get("1-milk");
                    break;
                case 2:
                    price = price + components.get("2-syrup");
                    break;
                case 3:
                    price = price + components.get("3-coffe");
                    break;
                case 4:
                    price = price + components.get("4-cream");
                    break;
                case 5:
                    price = price + components.get("5-sugar");
                    break;
                case 6:
                    price = price + components.get("6-cinnamon");
                    break;
                case 7:
                    price = price + components.get("7-mint");
                    break;
                case 8:
                    price = price + components.get("8-lime");
                    break;
                case 9:
                    price = price + components.get("9-juice");
                    break;
                default:
                    k = 0;
            }
        } while (k != 0);
        System.out.println(price);
    }
}
