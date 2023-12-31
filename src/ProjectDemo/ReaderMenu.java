package ProjectDemo;

import java.io.IOException;
import java.io.Serializable;

public class ReaderMenu implements Serializable {

    public static void readerMenu() throws IOException, ClassNotFoundException {
        System.out.println("Welcome to Reader Portal");
        System.out.println("-------------------------------");
        //System.out.println("Press 1 for LogIn, press 2 for SignIn, press 0 for Exit");
        int answer = -1;
        while (answer != 0) {
            System.out.println("Press 1 for LogIn, press 2 for SignIn, press 0 for Exit");
            answer = Service.enterInt();
            switch (answer) {
                case 1:
                    if (!Library.getReaderList().isEmpty()) {
                        System.out.println("LogIN menu");
                        int redaerId = Library.logInReader();
                        if (redaerId != -1) {
                            int readerAnswer = -1;
                            while (readerAnswer != 0) {
                                System.out.println("1-Show Book List");
                                System.out.println("2-Find a Book");
                                System.out.println("3-Ask about book");
                                System.out.println("0-EXIT");
                                readerAnswer = Service.enterInt();
                                switch (readerAnswer) {
                                    case 1:
                                        System.out.println(Library.getBookList());
                                        break;
                                    case 2:
                                        if (Library.findBook(Library.getBookList()) != -1)
                                            System.out.println("Library has that book");
                                        else
                                            System.out.println("Library DOESN't has that book");
                                        break;
                                    case 3:
                                        System.out.println("3-Ask about book");
                                        Library.makeOrder(redaerId);

                                        break;
                                    case 0:
                                        System.out.println("EXIT");
                                        break;
                                    default:
                                        System.out.println("You put a wrong option");
                                        break;

                                }
                            }
                        }
                    } else
                        System.out.println("No Readers in a List");
                    break;
                case 2:
                    System.out.println("SignIn Menu");
                    Library.registrationReader();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("You press a wrong option");
                    break;
            }
        }
    }
}
