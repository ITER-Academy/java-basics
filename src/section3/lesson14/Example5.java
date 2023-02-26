package section3.lesson14;

import java.util.Arrays;

public class Example5 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matrix: " + Arrays.deepToString(matrix));

        System.out.println("Element at row=1 and column=1: " + matrix[1][1]);

        matrix[1][1] = 10;
        System.out.println("Element at row=1 and column=1: " + matrix[1][1]);

        int[][][] threeDimensionalArray = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        System.out.println("Three-dimensional array: " + Arrays.deepToString(threeDimensionalArray));
    }
}
