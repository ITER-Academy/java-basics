package section3.lesson4;

public class Example2 {

    public static void main(String[] args) {
        int x = 5;

        if (x == 5) { // block starts here
            int y = 10; // y has block scope within if statement
            System.out.println(y); // y can be accessed here
        } // block ends here

        System.out.println(x); // x can still be accessed here
        // System.out.println(y); // y cannot be accessed here
    }
}
