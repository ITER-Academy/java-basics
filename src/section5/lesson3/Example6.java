package section5.lesson3;

import java.util.HashSet;
import java.util.Set;

public class Example6 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        set1.retainAll(set2);
        System.out.println(set1);
    }
}
