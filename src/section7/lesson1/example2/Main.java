package section7.lesson1.example2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add("three"); // adding a string to the collection

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(1);
        numbers2.add(2);
//        numbers2.add("three"); // compile-time error
    }
}
