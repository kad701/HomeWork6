package Project;

import java.io.Serializable;
import java.util.ArrayList;

public class Reader implements Serializable {
    private int id;
    private String name;
    private String surname;
    private String login;
    private String password;
    private String raiting;
    private ArrayList<String> bookList = new ArrayList<>();

    public static int counter = 0;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Reader(String name, String surname, String login, String password) {
        this.id = counter++;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.raiting = "Normal";
        // this.bookList=bookList;
    }


    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


}
