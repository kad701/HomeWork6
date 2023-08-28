import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       // System.out.println("Введите номер задачи ");
        int k=7;
        while(k!=0) {
            System.out.println();
            System.out.println("Введите номер задачи ");
            k = scanner.nextInt();
            switch (k) {
                case 1:
                    Task1.task1();
                    break;
                case 2:
                    Task2.task2();
                    break;
                case 3:
                    Task3.task3();
                    break;
                case 4:
                    Task4.task4();
                    break;
                case 5:
                    Task5.task5();
                    break;
                case 6:
                    Task6.task6();
                    break;
                default:
                    System.out.println("не верный ввод");
            }

        }
    }
}
