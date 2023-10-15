package ProjectDemo;

import java.io.*;
import java.util.ArrayList;

public class Book implements Serializable {

    int id;
    private int amountInStock;
    private String title;
    private String author;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", amountInStock=" + amountInStock +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Book(int id, int amountInStock, String title, String author) {
        this.id = id;
        this.amountInStock = amountInStock;
        this.title = title;
        this.author = author;
    }


    // fill file of Books
    public static ArrayList<Book> createBookList() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book(188, 3, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(2, 2, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book(3, 4, "Pride and Prejudice", "Jane Austen"));
        bookList.add(new Book(5, 5, "The Catcher in the Rye", "J.D. Salinger"));
        bookList.add(new Book(6, 2, "Brave New World", "Aldous Huxley"));
        bookList.add(new Book(7, 4, "The Chronicles of Narnia", "C.S. Lewis"));
        bookList.add(new Book(8, 3, "Moby-Dick", "Herman Melville"));
        bookList.add(new Book(9, 1, "War and Peace", "Leo Tolstoy"));
        bookList.add(new Book(10, 5, "The Hobbit", "J.R.R. Tolkien"));
        bookList.add(new Book(11, 2, "The Lord of the Rings", "J.R.R. Tolkien"));
        bookList.add(new Book(12, 4, "The Catcher in the Rye", "J.D. Salinger"));
        bookList.add(new Book(13, 3, "Brave New World", "Aldous Huxley"));
        bookList.add(new Book(14, 1, "The Chronicles of Narnia", "C.S. Lewis"));
        bookList.add(new Book(15, 5, "Pride and Prejudice", "Jane Austen"));
        bookList.add(new Book(16, 2, "1984", "George Orwell"));
        bookList.add(new Book(17, 4, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book(18, 3, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(19, 1, "Moby-Dick", "Herman Melville"));
        bookList.add(new Book(20, 5, "War and Peace", "Leo Tolstoy"));
        bookList.add(new Book(21, 2, "The Hobbit", "J.R.R. Tolkien"));
        bookList.add(new Book(22, 4, "The Lord of the Rings", "J.R.R. Tolkien"));
        bookList.add(new Book(23, 3, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));
        bookList.add(new Book(24, 1, "The Catcher in the Rye", "J.D. Salinger"));
        bookList.add(new Book(25, 5, "Pride and Prejudice", "Jane Austen"));
        bookList.add(new Book(26, 2, "Moby-Dick", "Herman Melville"));
        bookList.add(new Book(27, 4, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book(28, 3, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(29, 1, "1984", "George Orwell"));
        bookList.add(new Book(30, 5, "The Hobbit", "J.R.R. Tolkien"));
        bookList.add(new Book(31, 2, "Brave New World", "Aldous Huxley"));
        bookList.add(new Book(32, 4, "The Chronicles of Narnia", "C.S. Lewis"));
        bookList.add(new Book(33, 3, "Harry Potter and the Chamber of Secrets", "J.K. Rowling"));
        bookList.add(new Book(34, 1, "War and Peace", "Leo Tolstoy"));
        bookList.add(new Book(35, 5, "The Lord of the Rings", "J.R.R. Tolkien"));
        bookList.add(new Book(36, 2, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(37, 4, "Moby-Dick", "Herman Melville"));
        bookList.add(new Book(38, 3, "Pride and Prejudice", "Jane Austen"));
        bookList.add(new Book(39, 1, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book(40, 5, "The Catcher in the Rye", "J.D. Salinger"));
        bookList.add(new Book(41, 2, "1984", "George Orwell"));
        bookList.add(new Book(42, 4, "The Hobbit", "J.R.R. Tolkien"));
        bookList.add(new Book(43, 3, "The Chronicles of Narnia", "C.S. Lewis"));
        bookList.add(new Book(44, 1, "Brave New World", "Aldous Huxley"));
        bookList.add(new Book(45, 5, "Harry Potter and the Prisoner of Azkaban", "J.K"));
        return bookList;

    }

    public static void fillBooksFile(ArrayList<Book> books) throws IOException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(Main.bookLink));
        objectOutputStream.writeObject(books);
        objectOutputStream.close();
    }

}
