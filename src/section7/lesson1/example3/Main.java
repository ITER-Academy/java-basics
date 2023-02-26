package section7.lesson1.example3;

public class Main {

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello, world!");
        String str = stringBox.getValue();
        System.out.println("String box value: " + str);

        Box<Integer> intBox = new Box<>();
        intBox.setValue(42);
        int num = intBox.getValue();
        System.out.println("int box value: " + num);
    }
}
