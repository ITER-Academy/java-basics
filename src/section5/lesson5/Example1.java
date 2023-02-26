package section5.lesson5;

import java.util.HashMap;
import java.util.Map;

public class Example1 {

    public static void main(String[] args) {
        Map<String, String> studentTeacher = new HashMap<>();
        studentTeacher.put("John Doe", "Ms. Smith");
        studentTeacher.put("Jane Doe", "Mr. Johnson");
        studentTeacher.put("Jim Brown", "Ms. Smith");

        System.out.println("John Doe's teacher: " + studentTeacher.get("John Doe"));
        System.out.println("Jane Doe's teacher: " + studentTeacher.get("Jane Doe"));
        System.out.println("Jim Brown's teacher: " + studentTeacher.get("Jim Brown"));
    }
}
