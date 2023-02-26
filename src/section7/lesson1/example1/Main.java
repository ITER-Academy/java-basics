package section7.lesson1.example1;

public class Main {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(10);
        System.out.println(integerBox.get());
    }
}
