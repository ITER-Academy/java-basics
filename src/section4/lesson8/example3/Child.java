package section4.lesson8.example3;

public class Child extends Parent {

    void display() {
        super.display(); // Calls display() method of Parent class
        System.out.println("Display method in Child");
    }
}
