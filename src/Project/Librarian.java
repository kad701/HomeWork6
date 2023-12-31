package Project;

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

    public Librarian(String login, String password, String name, String surname) {
        this.id = counter++;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

