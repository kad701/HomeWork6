package lesson6;

import java.util.Scanner;

public class Task4 {

    static String []str=new String[3];
static int num=0;
    public static void task4(){
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("Введите строку "+(i+1));
            str[i]=scanner.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            Task4.checkMethod(str[i]);
        }
    }

    public static void checkMethod(String s) {
        char[] ch = new char[s.length()];
        s.getChars(0, s.length(), ch, 0);
        int k=0;
        for (int i = 0; i <ch.length ; i++) {
            for (int j = i+1; j <ch.length ; j++) {
                if(ch[i]==ch[j])
                    k++;

            }
        }
       if(k==0&num==0){
           num++;
           System.out.println(s);
       }
    }


}
