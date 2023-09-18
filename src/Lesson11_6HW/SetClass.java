package Lesson11_6HW;

import java.util.HashSet;

public class SetClass {
    public static void union(HashSet<String> set1, HashSet<String> set2) {
        for (String hs :
                set2) {
            set1.add(hs);
        }
    }

    public static HashSet<String> intersect(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> hashSetIntersect = new HashSet<>();
        for (String hs :
                set2)
            if (!set1.add(hs))
                hashSetIntersect.add(hs);
        return hashSetIntersect;
    }


}

