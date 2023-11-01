package GameXand0;

import java.util.Scanner;

public class TicTacToe {
    static String[][] table = new String[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a new game");
        newTable();
        int step = 0;
        while (step <= 9) {
            step++;
            System.out.println("Player 1 step");
            nextStep(table, "X");
            showTable(table);

            if (winCondition(table)) {
                System.out.println("Player 1 Win");
                break;
            }
            System.out.println("Player 2 step");
            nextStep(table, "O");
            showTable(table);
            if (winCondition(table)) {
                System.out.println("Player 2 Win");
                break;
            }
        }


    }

    static void showTable(String[][] table) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + table[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void newTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = ".";
                System.out.print(" " + table[i][j] + " ");
            }
            System.out.println();
        }

    }

    static String[][] nextStep(String[][] table, String mark) {
        Scanner scanner = new Scanner(System.in);
        int iPosition = -1;
        int jPosition = -1;
        while (!isEmptyIsExisting(table, iPosition, jPosition)) {
            System.out.println("enter --i-- position");
            iPosition = scanner.nextInt();
            System.out.println("enter --j-- position");
            jPosition = scanner.nextInt();
        }
        if (table[iPosition][jPosition].equals("X") || (table[iPosition][jPosition].equals("O")))
            System.out.println("enter another position");
        table[iPosition][jPosition] = mark;
        return table;


    }

    static boolean winCondition(String[][] table) {
        if (table[0][0].equals("X") && table[0][1].equals("X") && table[0][2].equals("X") ||
                table[1][0].equals("X") && table[1][1].equals("X") && table[1][2].equals("X") ||
                table[2][0].equals("X") && table[2][1].equals("X") && table[2][2].equals("X") ||
                table[0][0].equals("X") && table[1][0].equals("X") && table[2][0].equals("X") ||
                table[0][1].equals("X") && table[1][1].equals("X") && table[2][1].equals("X") ||
                table[0][2].equals("X") && table[1][2].equals("X") && table[2][2].equals("X") ||
                table[0][0].equals("X") && table[1][1].equals("X") && table[2][2].equals("X") ||
                table[0][2].equals("X") && table[1][1].equals("X") && table[2][0].equals("X") ||
                table[0][0].equals("O") && table[0][1].equals("O") && table[0][2].equals("O") ||
                table[1][0].equals("O") && table[1][1].equals("O") && table[1][2].equals("O") ||
                table[2][0].equals("O") && table[2][1].equals("O") && table[2][2].equals("O") ||
                table[0][0].equals("O") && table[1][0].equals("O") && table[2][0].equals("O") ||
                table[0][1].equals("O") && table[1][1].equals("O") && table[2][1].equals("O") ||
                table[0][2].equals("O") && table[1][2].equals("O") && table[2][2].equals("O") ||
                table[0][0].equals("O") && table[1][1].equals("O") && table[2][2].equals("O") ||
                table[0][2].equals("O") && table[1][1].equals("O") && table[2][0].equals("O")) {
            return true;
        } else
            return false;
    }

    static boolean isEmptyIsExisting(String[][] table, int iPosition, int jPosition) {
        if (iPosition >= 0 && iPosition <= 2 && jPosition >= 0 && jPosition <= 2) {
            if (!table[iPosition][jPosition].equals("X") || !table[iPosition][jPosition].equals("O"))
                return true;
        }

        return false;

    }

}
