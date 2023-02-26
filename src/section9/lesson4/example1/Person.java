package section9.lesson4.example1;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;
    private Address address; // Address class should implement Serializable, otherwise NotSerializableException will be thrown during the serialization

    // Constructor, getters, and setters omitted for brevity
}
