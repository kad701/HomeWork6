package ProjectDemo;

import java.io.Serializable;

public class Order implements Serializable {
    private int id;
    private int idReader;
    private String bookTitle;

    public Order(int id, int idReader, String bookTitle) {
        this.id = id;           // ------------
        this.idReader = idReader;
        this.bookTitle = bookTitle;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", idReader=" + idReader +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }
}
