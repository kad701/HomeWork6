package Lesson13_HW;

import java.util.stream.Stream;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> persons = new HashMap<>();
        StringBuilder str;
        persons.put(1, "ab");
        persons.put(2, "abb");
        persons.put(3, "ahh");
        persons.put(4, "af44");
        persons.put(5, "a123");
        persons.put(6, "a234");
        persons.put(7, "a44");
        persons.put(8, "aff");
        persons.put(9, "acs");
        persons.put(10, "ascscs");
        persons.put(11, "ascss");
        persons.put(12, "ajh");
        persons.put(13, "ayyy");
        persons.put(14, "arrr");
        persons.put(15, "aee");
        persons.put(16, "art");
        System.out.println(persons);
        System.out.println("------");
        persons.entrySet().stream().filter(el -> (el.getKey() == 13) | (el.getKey() == 1) | (el.getKey() == 2)
                        | (el.getKey() == 5) | (el.getKey() == 8) | (el.getKey() == 9))
                       .filter(el -> el.getValue().length() % 2 == 0)
                .forEach(el -> System.out.println(el.getKey() + " " + new StringBuilder(el.getValue()).reverse()));

    }
}
