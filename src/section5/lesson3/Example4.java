package section5.lesson3;

import java.util.HashSet;
import java.util.Set;

public class Example4 {

    public static void main(String[] args) {
        // Adding elements to a set
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Checking if a set contains a particular element
        System.out.println(numbers.contains(1)); // Output: true
        System.out.println(numbers.contains(4)); // Output: false

        // Removing an element from a set
        numbers.remove(2);
        System.out.println(numbers.contains(2)); // Output: false
    }
}
