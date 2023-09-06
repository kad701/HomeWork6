package Lesson9_2;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message) {
        super("Password should be less then 20 symbols or confirm password is fauls");
    }

    public WrongPasswordException() {
    }
}
