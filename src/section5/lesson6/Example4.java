package section5.lesson6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example4 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
        System.out.println("Source numbers: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);

        int index = Collections.binarySearch(numbers, 3);
        System.out.println("Index of first entry of '3': " + index);

        Collections.reverse(numbers);
        System.out.println("Reversed numbers: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled numbers: " + numbers);

        Collections.fill(numbers, 0);
        System.out.println("Filled with '0' numbers: " + numbers);
    }
}
