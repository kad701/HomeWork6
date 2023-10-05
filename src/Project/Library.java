package Project;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Library implements Serializable {
    static ArrayList<Librarian> librarianList = new ArrayList<>();
    static ArrayList<Reader> readerList = new ArrayList<>();


    //////////
    public static void registration() throws IOException, ClassNotFoundException {

        ArrayList<Librarian> existingLibrarians = getLibrarianList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        String login = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter surname");
        String surname = scanner.next();


        Librarian newLibrarian = new Librarian(login, password, name, surname);


        existingLibrarians.add(newLibrarian);


        saveLibrarianList(existingLibrarians);
    }


    public static ArrayList<Librarian> getLibrarianList() throws IOException, ClassNotFoundException {
        File file = new File("D://librarianList.txt");
        if (!file.exists() || file.length() == 0) {

            return new ArrayList<>();
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Librarian> librarianList = (ArrayList<Librarian>) objectInputStream.readObject();
        objectInputStream.close();

        return librarianList;
    }


    public static void saveLibrarianList(ArrayList<Librarian> librarianList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D://librarianList.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(librarianList);

        objectOutputStream.close();
        fileOutputStream.close();
    }


////////////////////////

    public static void registrationReader() throws IOException, ClassNotFoundException {

        ArrayList<Reader> existingReaders = getReaderList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        String login = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter surname");
        String surname = scanner.next();

        // Создать нового читателей
        Reader newReader = new Reader(login, password, name, surname);

        // Добавить нового читателей к существующему списку
        existingReaders.add(newReader);

        // Записать обновленный список читателей в файл
        saveReaderList(existingReaders);
    }

    //
    public static ArrayList<Reader> getReaderList() throws IOException, ClassNotFoundException {
        File file = new File("D://ReaderList.txt");
        if (!file.exists() || file.length() == 0) {

            return new ArrayList<>();
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Reader> readerList = (ArrayList<Reader>) objectInputStream.readObject();
        objectInputStream.close();

        return readerList;
    }


    public static void saveReaderList(ArrayList<Reader> readerList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D://readerList.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(readerList);

        objectOutputStream.close();
        fileOutputStream.close();
    }


    //////////


    public static boolean logInLibrarian() throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D://librarianList.txt"));
        ArrayList<Librarian> librarianList = (ArrayList<Librarian>) objectInputStream.readObject();

        objectInputStream.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Librarian Login");
        String login = scanner.next();
        System.out.println("enter Librarian password");
        String password = scanner.next();
        for (Librarian librarian :
                librarianList) {
            if (librarian.getLogin().equals(login) && librarian.getPassword().equals(password))
                return true;
        }
        return false;
    }

    public static boolean logInReader() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D://readerList.txt"));
        ArrayList<Reader> readerList = (ArrayList<Reader>) objectInputStream.readObject();

        objectInputStream.close();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Reader Login");
        String login = scanner.next();
        System.out.println("Enter Reader password");
        String password = scanner.next();

        for (Reader reader : readerList) {
            if (reader.getLogin().equals(login) && reader.getPassword().equals(password)) {
                return true; // Найдено соответствие, можно вернуть true
            }
        }


        return false;
    }


    public static void showBookList() throws IOException {
        FileReader reader = new FileReader("D://books.txt");
        StringBuilder builder = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            builder.append((char) c);
        }
        System.out.println(builder.toString());
        reader.close();
    }

    public static String findBook() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D://books.txt"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a book you are looking for");
        String bookName = scanner.next();
        String line;
        boolean found = false;

        while ((line = reader.readLine()) != null) {
            if (line.contains(bookName)) {
                found = true;
                System.out.println("Найденная строка: " + line);
                System.out.println("Количество доступных книг: " + line.substring(0, 1));
                break;
            }

        }

        reader.close();
        return line;
    }


    public static void giveBookToReader() throws IOException {
        System.out.println("What book you are looking for ");
        String bookString = Library.findBook();
        int bookAmount = Integer.parseInt(bookString.substring(0, 1));
        System.out.println("bookAmount   " + bookAmount);
        if (bookAmount > 0) {
            System.out.println("Whould you want give book to Rader Y/N ?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            switch (answer) {
                case "Y":
                    System.out.println("You  WANT give book to customer");
                    break;
                case "N":
                    System.out.println("You dont want give book to customer");
                    break;

            }
        } else System.out.println("No books in a stock");
    }


    //  public static void showReaderList(){}
    // public static void getBookFromReader(){}


    public static void writeBooksInFile() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D://bk.txt"));
        objectOutputStream.writeObject(new Book(2, "The Great Gatsby", "F. Scott Fitzgerald"));
        objectOutputStream.writeObject(new Book(5, "Brave New World", " Aldous Huxley"));
        objectOutputStream.writeObject(new Book(4, "The Chronicles of Narnia", "by C.S. Lewis"));


        objectOutputStream.close();

    }

    public static void readBooksFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D://bk.txt"));

        ArrayList<Book> bookList = new ArrayList<>();
        try {
            while (true) {
                Book book = (Book) objectInputStream.readObject();
                bookList.add(book);
            }
        } catch (EOFException e) {

        }
        objectInputStream.close();
        System.out.println(bookList.toString());

    }
}
