package ProjectDemo;

import java.io.IOException;
import java.io.Serializable;

public class MainMenu implements Serializable {
    public static void mainMenu() throws IOException, ClassNotFoundException {
        System.out.println("Hello, Welcom to our Library");
        System.out.println("-----------------------------");
        int answer = -1;
        while (answer != 0) {
            System.out.println("If you are a Reader press 1, if you are Librarian press 2,press 0 for Exit");
            answer = Service.enterInt();
            switch (answer) {
                case 1:
                    System.out.println("calling Reader Menu");
                    ReaderMenu.readerMenu();
                    break;
                case 2:
                    System.out.println("enter a Librarian code");
                    if (Service.enterString().equals("1111"))
                        LibrarianMenu.librarianMenu();
                    else {
                        System.out.println("it is a wrong code, you are not Librarian");
                        answer = 0;
                    }
                    break;
                case 0:
                    System.out.println("EXIT site");
                    break;
                default:
                    System.out.println("You press a wrong option, try again");
                    break;
            }
        }
    }

}
