package Lesson9_2;

public class WorkClass {
    public static boolean signing(String login, String password, String confirmPassword) {
        try {
            boolean b = login.matches("-?[0-9_a-zA-Z]+");

            if (login.length() > 20) {
                throw new WrongLoginException("");
            }
            if (!b) {
                throw new WrongLoginException("");
            }
        } catch (WrongLoginException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
        try {
            boolean b = password.matches("-?[0-9_a-zA-Z]+");
            System.out.println(b);
            if (!b) {
                throw new WrongPasswordException("");
            }
            if (password.length() > 20 || !(password.equals(confirmPassword)))
                throw new WrongPasswordException("");
        } catch (WrongPasswordException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
        return true;
    }
}
