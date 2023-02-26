package section5.lesson3;

import java.util.HashSet;

public class Example1 {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3); // this will be ignored as a duplicate
        System.out.println(set); // prints [1, 2, 3]
    }
}
