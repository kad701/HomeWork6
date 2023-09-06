package Lesson9_2;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super("Login should be less then 20 symbols or wrong symbols");
    }
}
