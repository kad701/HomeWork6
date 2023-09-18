package Lesson11_6HW;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("aa");
        hashSet1.add("bb");
        hashSet1.add("cc");
        hashSet1.add("dd");
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("aa");
        hashSet2.add("bb");
        hashSet2.add("ff");
        hashSet2.add("yy");
        HashSet<String> hashSet3 = new HashSet<>();
        hashSet3.add("aa");
        hashSet3.add("bb");
        hashSet3.add("cc");
        hashSet3.add("dd");

        SetClass.union(hashSet1, hashSet2);
        System.out.println("union " + hashSet1);

        System.out.println("intersection " + SetClass.intersect(hashSet3, hashSet2));


    }
}
