package section4.lesson10.example8;

public class Main {

    public static void main(String[] args) {
        Animal a = new Dog();
//        a.bark(); // not available, because variable a has type Animal
        Dog d = (Dog) a;
        d.bark();
    }
}
