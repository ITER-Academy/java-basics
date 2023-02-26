package section3.lesson12;

public class Example1 {

    public static void main(String[] args) {
        System.out.println("A 'for' loop that counts from 5 to 15 in increments of 2:");
        for (int i = 5; i <= 15; i += 2) {
            System.out.println(i);
        }

        System.out.println("A 'for' loop that counts down from 10 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("A 'for' loop that prints out the first 10 even numbers:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        System.out.println("A 'for' loop that calculates the factorial of a given number:");
        // 5! = 5 * 4 * 3 * 2 * 1
        int num = 5;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
