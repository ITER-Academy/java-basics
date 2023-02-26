package section9.lesson4.example3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "files/section9/lesson4/employee.ser";
        Employee employee = new Employee("John Doe", 30, 123456789);

        // Write the Employee object to a file
        FileOutputStream fileOut = new FileOutputStream(filePath);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(employee);
        out.close();
        fileOut.close();

        // Read the Employee object from the file
        FileInputStream fileIn = new FileInputStream(filePath);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Employee deserializedEmployee = (Employee) in.readObject();
        in.close();
        fileIn.close();

        System.out.println("Name: " + deserializedEmployee.getName());
        System.out.println("Age: " + deserializedEmployee.getAge());
        System.out.println("SSN: " + deserializedEmployee.getSsn());
    }
}
