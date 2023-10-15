package ProjectDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
// Программа представляет собой библиотеку. Имеется читатель и библиотекарь. Каждый заходит на портал,
// может зарегестрироваться, если вы библиотекарь то программа попросит у вас сразу ввести код(1111),
// если не верно то программа сразу завершается, если верно то далее предлагается либо зарегестроваться если у вас
// нет еще учетной записи или залогиниться, тогда вам покажится функции что вы модете выполнить,
// посмотреть список книг, найти книгу(вводите полное имя книги), посмотреть список читателей,
// изменить рейтинг читателя, выдать и получить книгу обратно от читателя. Читатель может только зайти в учетную
// запись найти книгу или посмотреть список книг в библиотеке. В планах создать метод для написания сообщения читателем
//библиотекарю о том какая книга его интересует, чтоб библитекарь мог выдать эту книгу.
//
// Использованы большинство функций структурного программирования, созданы классы сущностей блиотекарь читатель
// и книга, активно использованы коллекции типа ArrayList, запись и чтения объектов в файл, таким образом
// организована база данных. Основной класс, реализующий главный функционал Library содержит большинство методов
// которые нам необходимы. Некоторые функции, а именно для ввода значения с клавиатуры вынесены в отдельный метод,
// к ним в ходе выполнения программы мы обращаемся множество раз.


//  Book.fillBooksFile(Book.createBookList()); -заполняет файл списком книг.
//
//
//
public class Main implements Serializable {
    static String bookLink="D://books.txt";
    static String readerLink="D://readerList.txt";
    static String librarianLink = "D://librarianList.txt";
    static String orderLink="D://orders.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        if (Library.getBookList().isEmpty()) {
            Book.fillBooksFile(Book.createBookList());
            MainMenu.mainMenu();
        } else {
            MainMenu.mainMenu();
        }
    }
}
