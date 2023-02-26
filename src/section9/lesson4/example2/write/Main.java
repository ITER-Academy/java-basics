package section9.lesson4.example2.write;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import section9.lesson4.example2.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("John Doe", 35);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("files/section9/lesson4/person.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(person);
            outputStream.close();
            fileOutputStream.close();
            System.out.println("Person has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
