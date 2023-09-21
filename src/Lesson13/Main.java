package Lesson13;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        IShape shape = (x, y) -> 0.5 * x * y;

        double result = shape.getSquare(5, 7);
        System.out.println(result);

        ILogic logic = (a, b) -> {
            if (a < b)
                System.out.println("" + a);
            else if (a > b)
                System.out.println("" + b);
            else System.out.println("a=b");
        };
        logic.logicOperation(4, 6);

        Predicate<Integer> isPositive = x -> x > 0;
        int[] array = {4, 5, 6, -6, -4, 0, 6};
        for (int a :
                array) {
            if (isPositive.test(a))
                System.out.println(a);
        }
        Consumer<String> consumer = str -> {
            int spaceIndex = str.indexOf(" ");
            String strNumber = str.substring(0, spaceIndex);
            Integer amount = Integer.parseInt(strNumber);
            System.out.println("$= " + (amount / 3.2));
        };
        consumer.accept("2600 BYN");
        Function<String, Double> function = str -> {
            int spaceIndex = str.indexOf(" ");
            String strNumber = str.substring(0, spaceIndex);
            Integer amount = Integer.parseInt(strNumber);
            return amount / 3.2;
        };
        System.out.println(function.convert("26000 BYN"));

        Supplier<StringBuilder> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter string");
            String str = scanner.nextLine();
            StringBuilder strblrd = new StringBuilder(str);
            return strblrd.reverse();
        };

        System.out.println(supplier.get());

        UnaryOperator<Integer> unaryOperator = x -> x * x;
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < array2.length; i++) {
            Integer number = array2[i];
            array2[i] = unaryOperator.apply(number);
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        BinaryOperator<Integer> binaryOperator = (x, y) -> x * y;
        int[] array3 = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < array3.length; i++) {
            Integer number = array3[i];
            array3[i] = binaryOperator.apply(number, number);
            System.out.print(array3[i] + " ");
        }

    }
}


interface IShape {
    double getSquare(int x, int y);
}

interface ILogic {
    void logicOperation(int a, int b);
}

interface Predicate<T> {
    boolean test(T t);
}

interface Consumer<T> {
    void accept(T t);
}

interface Function<T, R> {
    R convert(T t);
}

interface Supplier<T> {
    T get();
}

interface UnaryOpertor<T> {
    T apply(T t);
}

interface BinaryOperator<T> {
    T apply(T t, T r);
}



