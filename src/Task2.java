import java.util.Scanner;
public class Task2 {
    static String []str=new String[3];
    public static void task2(){
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("Введите строку "+(i+1));
            str[i]=scanner.nextLine();
        }
        Task2.sortOrder();
    }

    public static void sortOrder(){
        for (int i = 0; i <3 ; i++) {
            minString(i);
        }
        for (int i = 0; i <3 ; i++) {
            System.out.println(str[i]);
        }
    }
    public static void minString(int k) {
        String s;
        int tempi;
        int min = str[k].length();
        for (int i = k; i < 3; i++) {
            if (str[i].length() < min) {
                min = str[i].length();
                tempi=i;
                s=str[k];
                str[k]=str[i];
                str[i]=s;

            }
        }



    }
}







