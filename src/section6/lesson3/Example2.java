package section6.lesson3;

public class Example2 {

    public static void main(String[] args) {
        divide("4", "2");
        divide("4", "0");
        divide("4", "abcd");
    }

    private static void divide(String num1AsString, String num2AsString) {
        try {
            int num1 = Integer.parseInt(num1AsString);
            int num2 = Integer.parseInt(num2AsString);
            int result = num1 / num2;
            System.out.println("Result of " + num1AsString + "/" + num2AsString + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
