package section9.lesson4.example3;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private int age;
    private transient int ssn;

    public Employee(String name, int age, int ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSsn() {
        return ssn;
    }
}
