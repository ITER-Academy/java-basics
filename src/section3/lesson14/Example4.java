package section3.lesson14;

import java.util.Arrays;

public class Example4 {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 1, 4, 3};
        System.out.println("The length of the array is: " + numbers.length);

        int[] numbers2 = {5, 2, 1, 4, 3};
        Arrays.sort(numbers2);
        System.out.println("The sorted array is: " + Arrays.toString(numbers2));

        int[] numbers3 = {1, 2, 3, 4, 5};
        int searchKey = 4;
        int index = Arrays.binarySearch(numbers3, searchKey);
        if (index >= 0) {
            System.out.println("The element " + searchKey + " is found at index " + index);
        } else {
            System.out.println("The element " + searchKey + " is not found in the array.");
        }
    }
}
