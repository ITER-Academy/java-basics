package section3.lesson14;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {

        int[] integers = new int[5];
        System.out.println("Array of integer elements: " + Arrays.toString(integers));

        double[] doubles = new double[2];
        System.out.println("Array of double elements: " + Arrays.toString(doubles));

        boolean[] booleans = new boolean[3];
        System.out.println("Array of boolean elements: " + Arrays.toString(booleans));

        String[] strings = new String[4];
        System.out.println("Array of String elements: " + Arrays.toString(strings));

        int[] numbers;
        numbers = new int[]{1, 2, 3, 4, 5};

        System.out.println("The first element is: " + numbers[0]);

        numbers[0] = 6;

        System.out.println("The first element is now: " + numbers[0]);
    }
}
