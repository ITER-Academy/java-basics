package section5.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example3 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");

        for (String fruit : myList) {
            System.out.println(fruit);
        }

        Map<String, String> fruitColors = new HashMap<>();
        fruitColors.put("apple", "red");
        fruitColors.put("banana", "yellow");
        fruitColors.put("orange", "orange");

        for (Map.Entry<String, String> entry : fruitColors.entrySet()) {
            String fruit = entry.getKey();
            String color = entry.getValue();
            System.out.println(fruit + " is " + color);
        }
    }
}
