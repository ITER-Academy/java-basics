package section5.lesson5;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        System.out.println(map);

        Integer age = map.get("Bob");
        System.out.println("Bob's age: " + age);

        Integer removedAge = map.remove("Charlie");
        System.out.println("Removed age (Charlie): " + removedAge);
        System.out.println(map);
    }
}
