package Project;

import java.io.Serializable;

public class Book implements Serializable {
    private int amountInStock;
    private String title;
    private String author;


    @Override
    public String toString() {
        return "Book{" +
                "amountInStock=" + amountInStock +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Book(int amountInStock, String title, String author) {
        this.amountInStock = amountInStock;
        this.title = title;
        this.author = author;
    }
}
