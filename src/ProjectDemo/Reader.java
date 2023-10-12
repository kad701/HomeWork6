package ProjectDemo;

import ProjectDemo.Library;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Reader implements Serializable {
    private int id;
    private String name;
    private String surname;
    private String login;
    private String password;
    private String raiting;
    private ArrayList<ProjectDemo.Book> bookList;

    public static int counter = 0;

    public String getLogin() {
        return login;
    }

    public int getReaderId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public Reader(String name, String surname, String login, String password) throws IOException, ClassNotFoundException {
        this.id = Library.getReaderList().size() + 1;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.raiting = "Normal";
        this.bookList = new ArrayList<Book>();
    }


    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }


    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setRaiting(String raiting) {
        this.raiting = raiting;
    }


    public int getId() {
        System.out.println("Enter 1 if you start program First time or Anything if not firs time");
        return id;

    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", raiting='" + raiting + '\'' +
                ", bookList=" + bookList +
                '}';

    }
}
