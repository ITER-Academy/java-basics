package section4.lesson8.example4;

public class Child extends Parent {

    Child() {
//        super(); // if we don't call any other constructor here (like the one below), then default constructor without parameters will be called automatically
        super(1, 2); // Calls the constructor of Parent class
        System.out.println("Child Constructor");
    }
}
