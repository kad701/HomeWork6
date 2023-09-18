package Lesson11_4HW;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<HavyBox> havyBoxes = new TreeSet<HavyBox>();
        havyBoxes.add(new HavyBox(1, 2));
        havyBoxes.add(new HavyBox(2, 1));
        havyBoxes.add(new HavyBox(3, 4));

        havyBoxes.add(new HavyBox(4, 2));
        havyBoxes.add(new HavyBox(5, 6));
        havyBoxes.add(new HavyBox(6, 7));
        havyBoxes.add(new HavyBox(7, 5));
        System.out.println(havyBoxes.toString());
        for (HavyBox hb :
                havyBoxes) {
            System.out.print("id is = " + hb.getId() + " weight is = " + hb.getWeight());
            System.out.println();
        }
    }
}
