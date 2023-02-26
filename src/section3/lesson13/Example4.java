package section3.lesson13;

public class Example4 {

    public static void main(String[] args) {
        addNumbers(1, 3);
        int sum = add(2, 3);
        System.out.println(sum);
        printMessage("Hello!");
    }

    public static void addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

//    public static int multiply(int a, int b) {
//        int result = a * b;
//    }
}
