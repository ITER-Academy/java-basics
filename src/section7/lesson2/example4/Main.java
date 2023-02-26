package section7.lesson2.example4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
