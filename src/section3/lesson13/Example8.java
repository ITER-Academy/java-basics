package section3.lesson13;

public class Example8 {

    public static void main(String[] args) {
        int factorialOf5 = factorial(5);
        System.out.println("Factorial of 5 is: " + factorialOf5);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
