import java.util.Scanner;

public class Task1 {
    static String []str=new String[3];
    public static void task1(){
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("Введите строку "+(i+1));
            str[i]=scanner.nextLine();
        }

        Task1.maxString();
        Task1.minString();
    }


    public static void maxString(){
        int max=str[0].length();
        for (int i = 1; i < 3; i++) {
            if(str[i].length()>max)
                max=str[i].length();
        }
        System.out.println("Самая длинная строка");
        for (int i = 0; i < 3; i++) {
            if(str[i].length()==max)
                System.out.println(str[i]);
        }
    }

    public static void minString(){
        int min=str[0].length();
        for (int i = 1; i < 3; i++) {
            if(str[i].length()<min)
                min=str[i].length();
        }
        System.out.println("Самая короткая строка");
        for (int i = 0; i < 3; i++) {
            if(str[i].length()==min)
                System.out.println(str[i]);
        }
    }



}
