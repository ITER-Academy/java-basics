package section5.lesson3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Example3 {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(1);
        System.out.println(treeSet);

        Set<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());
        treeSet2.add(2);
        treeSet2.add(3);
        treeSet2.add(1);
        System.out.println(treeSet2);
    }
}
