package Lesson12;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("APPLE");
        Banana banana = new Banana("BANANA");
        Orange orange = new Orange("ORANGE");
        Backet<Apple> backet1 = new Backet(apple);
        backet1.info();
        Backet<Banana> backet2 = new Backet(banana);
        backet2.info();
        newClass nc=new newClass();
        nc.sum(45,"djd");

    }
}
