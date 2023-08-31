package Lesson8;

public class Human implements Fly, Teleport, BreathINWater {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void breathingINWater() {
        System.out.println("I can breath under water");
    }

    @Override
    public void flying() {
        System.out.println("I can fly");

    }

    @Override
    public void teleporting() {
        System.out.println("i can teleport myself in class room");

    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
}
