package Lesson9;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("toyota", 180, 20000);
        Car Zaporogec = new Car();
        Car BMW = new Car("BMW", 240, 30000);
        try {
            toyota.start();
            System.out.println(toyota.getBrand() + "  Starting");
        } catch (Exception exception) {
            System.out.println(toyota.getBrand() + " not Starting");
        }

        try {
            Zaporogec.start();
            System.out.println(Zaporogec.getBrand() + "  Starting");
        } catch (Exception exception) {
            System.out.println(Zaporogec.getBrand() + " not Starting");
        }

        try {
            BMW.start();
            System.out.println(BMW.getBrand() + "  Starting");
        } catch (Exception exception) {
            System.out.println(BMW.getBrand() + " not Starting");
        }
    }
}
