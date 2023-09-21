package Lesson12_2;

//import static Lesson12_2.Main.rand;

public enum Color {
    WHITE(255, 255, 255), YELLOW(255, 255, 0), RED(255, 0, 0), COLOR1(rand(), rand(), rand());

    private int r;
    private int g;
    private int b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;

    }

    public void showCode() {
        Color c = this;
        System.out.println(c + " R= " + this.r + " G= " + this.g + " B= " + this.b);
    }

    public static int rand() {
        return (int) (Math.random() * 256);
    }
}
