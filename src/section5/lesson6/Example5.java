package section5.lesson6;

import java.util.Arrays;

public class Example5 {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5};
        System.out.println("Source array: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 5);
        System.out.println("Index of 5: " + index);

        Arrays.fill(arr, 0);
        System.out.println("Array filled with '0': " + Arrays.toString(arr));
    }
}
