package Lesson14_CW;

public class Tester {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Tester{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Tester(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
