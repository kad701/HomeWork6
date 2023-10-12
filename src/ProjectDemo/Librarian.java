package ProjectDemo;

import ProjectDemo.Library;

import java.io.IOException;
import java.io.Serializable;

public class Librarian implements Serializable {
    private int id;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    private String login;
    private String password;
    private String name;
    private String surname;
    static int counter = 0;

    public Librarian(String login, String password, String name, String surname) throws IOException, ClassNotFoundException {
        this.id = Library.getLibrarianList().size() + 1;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        System.out.println("Enter 1 if you start program First time or Anything if not firs time");
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
