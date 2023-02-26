package section9.lesson4.example2.read;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import section9.lesson4.example2.Person;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("files/section9/lesson4/person.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            Person person = (Person) inputStream.readObject();
            System.out.println("Deserialized Person name: " + person.getName());
            System.out.println("Deserialized Person age: " + person.getAge());
            inputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
