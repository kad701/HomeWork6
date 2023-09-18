package Lesson11_2HW;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "aa bb cc dd aa bb";
        String[] subString;
        subString = str.split(" ");
        System.out.println(str);
        ArrayList<String> listSubString = new ArrayList<>(Arrays.asList(subString));
        System.out.println(listSubString);
        int k = 1;
        for (int i = 0; i < listSubString.size(); i++) {
            k = 1;
            for (int j = i + 1; j < listSubString.size(); j++) {
                String str1 = listSubString.get(i);
                String str2 = listSubString.get(j);
                if (str1.equals(str2)) {
                    k++;
                    listSubString.remove(j);
                }
            }
            System.out.println(listSubString.get(i) + " appear " + k + " times");
        }
    }
}
