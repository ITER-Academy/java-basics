package section7.lesson1.example5;

public class Main {

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);

        Box<Integer> intBox2 = new Box<>();
        intBox2.set(20);

        System.out.println(intBox.compareTo(intBox2)); // prints -1
    }
}
