package section5.lesson3;

import java.util.HashSet;
import java.util.Set;

public class Example5 {

    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        Set<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(3);
        setB.add(4);

        setA.addAll(setB);
        System.out.println("Union of two sets: " + setA);
    }
}
