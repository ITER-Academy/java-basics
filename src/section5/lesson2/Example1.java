package section5.lesson2;

import java.util.ArrayList;

public class Example1 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);

        numbers.set(1, 4);
        System.out.println(numbers);

        int secondNumber = numbers.get(1);
        System.out.println(secondNumber);
    }
}
