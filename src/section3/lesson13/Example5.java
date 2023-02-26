package section3.lesson13;

public class Example5 {

    public static void main(String[] args) {
        System.out.println(add(1, 2)); // Prints 3
        System.out.println(add(1.0, 2.0)); // Prints 3.0
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
