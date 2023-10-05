package Project;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Librarian> librarianList = new ArrayList<Librarian>();
        //System.out.println(Library.logInLibrarian());
        Library.writeBooksInFile();
        Library.readBooksFromFile();
        //System.out.println(Library.getReaderList());
        //System.out.println(Library.getLibrarianList());
        int choise;

//        do{
//            System.out.println("Are you READER-1 or LIBRARIAN-2 EXIT-0");
//            choise=scanner.nextInt();
//            switch (choise) {
//                case 1:
//                    System.out.println("YOU are READER");
//                    System.out.println("MENU");
//                    System.out.println("Выдать список книг");
//                    System.out.println("Подать запрос на книгу");
//                    break;
//                case 2:
//                   ;
//                    System.out.println("Insert code if you LIBRARIAN");
//                    int code=scanner.nextInt();
//                    if(code==1111) {
//                        System.out.println("YOU are LIBRARIAN");
//                        System.out.println("1-REGISTRATION   2-LOG IN    0-EXIT");
//                        switch (scanner.nextInt()){
//                            case 1:
//                                System.out.println("registartion Method");
//                             Library.registration();                        //++++++++++++
//                                break;
//                            case 2:
//                                System.out.println("Log In Method");
//                             boolean logStatus=   Library.logInLibrarian();
//                             if(logStatus){
//                                 System.out.println("MENU");
//                                 System.out.println("Выдать список книг");//+++++++++++++  Library.showBookList();
//                                 System.out.println("Проверить запрос от читателей");
//                                 System.out.println("Показать список читателей");
//                                 System.out.println("Найти книгу");//++++++++++  Library.findBook();
//                                 System.out.println("Выдать книгу");
//                                 System.out.println("Изменить статус пользователя");
//                             }
//
//                                break;
//                            case 0:
//                                System.out.println("Exit to main menu");
//                                break;
//                            default:
//                                System.out.println("wrong number");
//
//                        }
//                    }
//                    else
//                        System.out.println("YOU are NOT Librarian");
//                    break;
//                case 0:
//
//                    System.out.println("EXIT");
//                    break;
//                default:
//                    System.out.println("you put a wrong number");
//            }
//        }
//        while(choise!=0);

    }
}
