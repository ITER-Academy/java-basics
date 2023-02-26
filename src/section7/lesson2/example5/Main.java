package section7.lesson2.example5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        List<Integer> numList = Arrays.asList(nums);
        System.out.println(numList);

        Integer[] nums2 = {1, 2, 3, 4, 5};
        List<Integer> numList2 = new ArrayList<>(Arrays.asList(nums2));
        System.out.println(numList2);
    }
}
