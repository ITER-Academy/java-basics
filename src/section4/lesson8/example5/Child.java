package section4.lesson8.example5;

public class Child extends Parent {

    int number = 200;

    void show() {
        System.out.println("Superclass number: " + super.number); // Refers to Parent's number
        System.out.println("Subclass number: " + number); // Refers to Child's number
    }
}
