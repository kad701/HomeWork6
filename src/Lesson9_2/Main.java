package Lesson9_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //  System.out.println("2093f4".matches("-?[0-9]+"));

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter login");
        String login= scanner.nextLine();
        System.out.println("enter password");
        String password= scanner.nextLine();
        System.out.println("confirm password");
        String confirmPassword= scanner.nextLine();

if(WorkClass.signing(login,password,confirmPassword)==true)
    System.out.println("Everything is Correct");
else System.out.println("Something wrong");
    }
}
