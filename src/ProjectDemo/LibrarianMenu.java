package ProjectDemo;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class LibrarianMenu implements Serializable {
    public static void librarianMenu() throws IOException, ClassNotFoundException {
        System.out.println("Welcome to Librarian Portal");
        System.out.println("-------------------------------");

        System.out.println("Press 1 for LogIn, press 2 for SignIn, press 0 for Exit");
        int answer = -1;
        while (answer != 0) {
            answer = Service.enterInt();
            switch (answer) {
                case 1:
                    System.out.println("LogIN menu");
                    if (Library.logInLibrarian()) {
                        System.out.println("1-Show Book List");
                        System.out.println("2-Find a Book");
                        System.out.println("3-Give Book to Reader");
                        System.out.println("4-Change Reader raiting");
                        System.out.println("5-Show List of Readers");
                        System.out.println("6-Get Book back from Reader");
                        System.out.println("0-Exit");
                        int librarianAnswer = -1;
                        while (librarianAnswer != 0) {
                            librarianAnswer = Service.enterInt();
                            switch (librarianAnswer) {
                                case 1:
                                    System.out.println("1-Show Book List");
                                    System.out.println(Library.getBookList());
                                    break;
                                case 2:
                                    System.out.println("2-Find a Book");
                                    int bookId = Library.findBook(Library.getBookList());
                                    if (bookId != -1)
                                        System.out.println(" book Id is " + bookId);
                                    else System.out.println("No that book in a stock");
                                    break;
                                case 3:
                                    System.out.println("3-Give Book to Reader");
                                    Library.giveBookToReader();
                                    break;
                                case 4:
                                    System.out.println("4-Change Reader raiting");
                                    System.out.println("put Reader id");
                                    int readerId = Service.enterInt();
                                    ArrayList<Reader> readerList = Library.getReaderList();
                                    System.out.println("1-Exellent 2-Good 3 Normal 4 Poor");
                                    int raiting = Service.enterInt();
                                    switch (raiting) {
                                        case 1:
                                            System.out.println("Exellent");
                                            for (Reader reader :
                                                    readerList) {
                                                if (reader.getId() == readerId)
                                                    reader.setRaiting("Exellent");
                                                Library.saveReaderList(readerList);
                                            }

                                            break;
                                        case 2:
                                            System.out.println("Good");
                                            for (Reader reader :
                                                    readerList) {
                                                if (reader.getId() == readerId)
                                                    reader.setRaiting("Good");
                                                Library.saveReaderList(readerList);
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Normal");
                                            for (Reader reader :
                                                    readerList) {
                                                if (reader.getId() == readerId)
                                                    reader.setRaiting("Normal");
                                                Library.saveReaderList(readerList);
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Poor");
                                            for (Reader reader :
                                                    readerList) {
                                                if (reader.getId() == readerId)
                                                    reader.setRaiting("Poor");
                                                Library.saveReaderList(readerList);
                                            }
                                            break;
                                        case 0:
                                            break;
                                        default:
                                            System.out.println("Wrong Option");

                                    }

                                    break;
                                case 5:
                                    System.out.println("5-Show List of Readers");
                                    System.out.println(Library.getReaderList());
                                    break;
                                case 6:
                                    System.out.println("6-Get Book back from Reader");
                                    Library.getBookBackFromReader();
                                    break;
                                case 0:
                                    System.out.println("0-Exit");
                                    break;
                                default:
                                    System.out.println("YOU press a wrong option");
                                    break;
                            }
                        }


                    }

                    break;
                case 2:
                    System.out.println("SignIn Menu");
                    Library.registrationLibrarian();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You press a wrong option");
                    System.out.println("Enter 1 if you start program First time or Anything if not firs time");
                    break;
            }
        }

    }
}
