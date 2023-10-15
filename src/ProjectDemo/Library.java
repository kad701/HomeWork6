package ProjectDemo;

import ProjectDemo.Librarian;
import ProjectDemo.Reader;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library implements Serializable {

    static ArrayList<ProjectDemo.Librarian> librarianList = new ArrayList<>();
    static ArrayList<ProjectDemo.Reader> readerList = new ArrayList<>();
    static ArrayList<ProjectDemo.Book> bookList = new ArrayList<>();
    static ArrayList<Order>orderList=new ArrayList<>();

    // Librarian registration
    public static void registrationLibrarian() throws IOException, ClassNotFoundException {
        ArrayList<ProjectDemo.Librarian> existingLibrarians = getLibrarianList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login for NEW Librarian");
        String login = scanner.next();
        System.out.println("Enter password for NEW Librarian should be more then 8 characters");
        String password = Service.enterString();
        while (password.length() < 8) {
            System.out.println("Enter password for NEW Librarian should be more then 8 characters");
            password = Service.enterString();
        }
        System.out.println("Enter name for NEW Librarian");
        String name = scanner.next();
        System.out.println("Enter surname for NEW Librarian");
        String surname = scanner.next();
        ProjectDemo.Librarian newLibrarian = new ProjectDemo.Librarian(login, password, name, surname);
        existingLibrarians.add(newLibrarian);
        saveLibrarianList(existingLibrarians);
    }

    public static ArrayList<ProjectDemo.Librarian> getLibrarianList() throws IOException, ClassNotFoundException {
        File file = new File(Main.librarianLink);
        if (!file.exists() || file.length() == 0) {

            return new ArrayList<>();
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        ArrayList<ProjectDemo.Librarian> librarianList = (ArrayList<ProjectDemo.Librarian>) objectInputStream.readObject();
        objectInputStream.close();

        return librarianList;
    }

    public static void saveLibrarianList(ArrayList<ProjectDemo.Librarian> librarianList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(Main.librarianLink);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(librarianList);

        objectOutputStream.close();
        fileOutputStream.close();
    }

    // Librarian LogIn
    public static boolean logInLibrarian() throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(Main.librarianLink));
        ArrayList<ProjectDemo.Librarian> librarianList = (ArrayList<ProjectDemo.Librarian>) objectInputStream.readObject();

        objectInputStream.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Librarian Login");
        String login = scanner.next();
        System.out.println("enter Librarian password");
        String password = Service.enterString();

        for (ProjectDemo.Librarian librarian :
                librarianList) {
            if (librarian.getLogin().equals(login) && librarian.getPassword().equals(password))
                return true;
        }
        return false;
    }

    // Reader registration
    public static void registrationReader() throws IOException, ClassNotFoundException {
        ArrayList<ProjectDemo.Reader> existingReaders = getReaderList();
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        String login = Service.enterString();
        System.out.println("Enter password");
        String password = Service.enterString();
        while (password.length() < 8) {
            System.out.println("Enter password for NEW Reader should be more then 8 characters");
            password = Service.enterString();
        }
        System.out.println("Enter name");
        String name = Service.enterString();
        System.out.println("Enter surname");
        String surname = Service.enterString();

        ProjectDemo.Reader newReader = new ProjectDemo.Reader( name, surname,login,password);

        existingReaders.add(newReader);

        saveReaderList(existingReaders);
    }

    public static ArrayList<ProjectDemo.Reader> getReaderList() throws IOException, ClassNotFoundException {
        File file = new File(Main.readerLink);
        if (!file.exists() || file.length() == 0) {

            return new ArrayList<>();
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        ArrayList<ProjectDemo.Reader> readerList = (ArrayList<ProjectDemo.Reader>) objectInputStream.readObject();
        objectInputStream.close();

        return readerList;
    }

    public static void saveReaderList(ArrayList<ProjectDemo.Reader> readerList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(Main.readerLink);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(readerList);

        objectOutputStream.close();
        fileOutputStream.close();
    }

    // reader LogIn
    public static int logInReader() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(Main.readerLink));
        ArrayList<Reader> readerList = (ArrayList<Reader>) objectInputStream.readObject();

        objectInputStream.close();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Reader Login");
        String login = scanner.next();
        System.out.println("Enter Reader password");
        String password = scanner.next();

        for (Reader reader : readerList) {
            if (reader.getLogin().equals(login) && reader.getPassword().equals(password)) {
                return reader.getReaderId();
            }
        }


        return -1;
    }

    // get List of Books
    public static ArrayList<ProjectDemo.Book> readBooksFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(Main.bookLink));
        ArrayList<ProjectDemo.Book> bookList = new ArrayList<>();
        try {
            while (true) {
                ProjectDemo.Book book = (ProjectDemo.Book) objectInputStream.readObject();
                bookList.add(book);
            }
        } catch (EOFException e) {
        }
        objectInputStream.close();
        // System.out.println(bookList.toString());
        return bookList;
    }

    // Find a book in a List return ID
    public static int findBook(ArrayList<Book> bookList) throws IOException, ClassNotFoundException {           //return book Id
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Book Title");
        String bookTitle = scanner.nextLine();
        for (Book book :
                bookList) {
            if (book.getTitle().equals(bookTitle))
                return book.getId();
        }
        return -1;
    }

    // Give book to Reader
    public static ArrayList<ProjectDemo.Book> getBookList() throws IOException, ClassNotFoundException {

        File file = new File(Main.bookLink);
        if (!file.exists() || file.length() == 0) {

            return new ArrayList<>();
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        ArrayList<ProjectDemo.Book> bookList = (ArrayList<ProjectDemo.Book>) objectInputStream.readObject();
        objectInputStream.close();

        return bookList;
    }

    public static void giveBookToReader() throws IOException, ClassNotFoundException {
        ArrayList<Book> currentBookList = Library.getBookList();
        ArrayList<ProjectDemo.Reader> currentReaderList = Library.getReaderList();

        System.out.println("enter a Reader Id");
        int readerId = Service.enterInt();
        System.out.println("enter a Book Id");
        int idBook = Service.enterInt();
        System.out.println("do you want give book with Id " + idBook + " to customer " + readerId + " Y/N");
        String answer = Service.enterString();
        switch (answer) {
            case "Y":
                System.out.println(" yes");

                for (Book book :
                        currentBookList) {
                    if (book.getId() == idBook) {
                        if (book.getAmountInStock() > 0) {
                            int numberBooks = book.getAmountInStock() - 1;
                            book.setAmountInStock(numberBooks);
                            for (ProjectDemo.Reader reader :
                                    currentReaderList) {
                                if (reader.getReaderId() == readerId) {
                                    if (reader.getBookList() == null) {
                                        ArrayList<Book> readerBooksList = new ArrayList<>();
                                        readerBooksList.add(book);
                                        reader.setBookList(readerBooksList);
                                        Library.saveReaderList(currentReaderList);
                                        Book.fillBooksFile(currentBookList);
                                    } else {
                                        ArrayList<Book> readerBooksList = reader.getBookList();
                                        readerBooksList.add(book);
                                        reader.setBookList(readerBooksList);
                                        Library.saveReaderList(currentReaderList);
                                        Book.fillBooksFile(currentBookList);

                                    }

                                }
                            }
                        }
                    }
                }
                break;
            case "N":
                System.out.println("no");
                break;
            default:
                System.out.println("You put a wrong answer");
        }

    }

    public static void getBookBackFromReader() throws IOException, ClassNotFoundException {
        ArrayList<Book> currentBookList = Library.getBookList();
        ArrayList<ProjectDemo.Reader> currentReaderList = Library.getReaderList();

        System.out.println("Enter Reader Id");
        int readerId = Service.enterInt();
        System.out.println("Enter Book Id whats return to Library");
        int bookId = Service.enterInt();
        System.out.println("do you want get book with Id " + bookId + " from Reader " + readerId + " Y/N");
        String answer = Service.enterString();
        ArrayList<Reader> listReaders = Library.getReaderList();
        switch (answer) {
            case "Y":
                System.out.println("You want to return a book from the reader");
                for (Reader reader : listReaders) {
                    if (reader.getId() == readerId) {
                        ArrayList<Book> readerBooks = reader.getBookList();
                        Iterator<Book> iterator = readerBooks.iterator();
                        while (iterator.hasNext()) {
                            Book book = iterator.next();
                            if (book.getId() == bookId) {
                                iterator.remove(); // Безопасное удаление элемента
                                ArrayList<Book> libraryBooks = Library.getBookList();
                                for (Book lbBook : libraryBooks) {
                                    if (lbBook.getId() == bookId) {
                                        lbBook.setAmountInStock(lbBook.getAmountInStock() + 1);
                                        Book.fillBooksFile(libraryBooks);
                                        Library.saveReaderList(listReaders);
                                    }
                                }
                            }
                        }
                    }
                }

                break;
            case "N":
                System.out.println("NO");
                break;
            default:
                System.out.println("Ypu press a wrong option");
                break;
        }
    }

    //
    public static void makeOrder(int idReader) throws IOException, ClassNotFoundException {
        ArrayList<Order> existingOrder= getOrderList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login book title you are looking");
        String title = Service.enterString();

        Order newOrder = new Order(getOrderList().size(), idReader, title);

        existingOrder.add(newOrder);

        saveOrderList(existingOrder);
    }


    public static ArrayList<Order> getOrderList() throws IOException, ClassNotFoundException {
        File file = new File(Main.orderLink);
        if (!file.exists() || file.length() == 0) {
            return new ArrayList<>();
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Order> orderList = (ArrayList<Order>) objectInputStream.readObject();
        objectInputStream.close();

        return orderList;
    }

    public static void saveOrderList(ArrayList<Order> orderList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(Main.orderLink);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(orderList);

        objectOutputStream.close();
        fileOutputStream.close();
    }

public static void removeOrder(int orderId) throws IOException, ClassNotFoundException {
        ArrayList<Order>orderArrayList=new ArrayList<>();
        if(!Library.getOrderList().isEmpty()){
            orderArrayList=Library.getOrderList();
            Order orderRemoved= null;
            for (Order order:
                 orderArrayList) {
                if (order.getId()==orderId) {
                    orderRemoved=order;
                    
                }
            }
            orderArrayList.remove(orderRemoved);
            Library.saveOrderList(orderArrayList);
        }
        else System.out.println("No orders");
}



    //

}


