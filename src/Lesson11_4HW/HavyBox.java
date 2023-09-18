package Lesson11_4HW;

public class HavyBox implements Comparable<HavyBox> {

    public int id;
    public int weight;

    public int getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    public HavyBox(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HavyBox{" +
                "id=" + id +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(HavyBox o) {
        return this.weight - o.weight;
    }
}
