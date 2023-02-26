package section5.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Example2 {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        ListIterator<String> iterator = fruits.listIterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("banana")) {
                iterator.remove();
                iterator.add("grapefruit");
            }
        }
        System.out.println(fruits);
    }
}
