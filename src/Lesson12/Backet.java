package Lesson12;

public class Backet <T>{
    T name;

    public Backet(T name) {
        this.name = name;
    }

    public void info() {
        System.out.println(name.toString());
    }
}
