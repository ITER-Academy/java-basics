package section5.lesson6.example6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 25));
        persons.add(new Person("Jane", 30));
        persons.add(new Person("Bob", 20));

        Collections.sort(persons);

        for (Person person : persons) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
