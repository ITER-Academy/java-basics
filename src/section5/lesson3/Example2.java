package section5.lesson3;

import java.util.HashSet;

public class Example2 {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("Source Set: " + set);

        set.add(2); // This will be ignored and not added to the set
        System.out.println("Set after adding '2': " + set);

        boolean containsTwo = set.contains(2); // This will return true
        System.out.println("'containsTwo' flag: " + containsTwo);

        set.remove(2); // This will remove 2 from the set
        System.out.println("Set after removing '2': " + set);
    }
}
