package section4.lesson12.example4.before;

public class Employee implements Person {

    @Override
    public void eat() {
        // do nothing
    }

    @Override
    public void sleep() {
        // do nothing
    }

    @Override
    public void work() {
        System.out.println("Employee works");
    }
}
