package Lesson6;

import java.util.Scanner;

public class Task3 {
    static String []str=new String[3];

    public static void task3(){
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("Введите строку "+(i+1));
            str[i]=scanner.nextLine();
        }
        for (int i = 0; i <3 ; i++) {
            if(str[i].length()< Task3.avrgSize()){
                System.out.println("Строка "+str[i]+" Длина "+str[i].length());
            }
        }

    }
public static double avrgSize(){
        double avrg=0;
    for (int i = 0; i < 3; i++) {
        avrg=avrg+str[i].length();
    }
   return avrg=(double)avrg/3;
}

}
