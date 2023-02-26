package section5.lesson6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            if (fruit.equals("banana")) {
                iterator.remove();
            }
        }
        System.out.println(fruits);
    }
}
