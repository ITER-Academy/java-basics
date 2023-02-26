package section3.lesson4;

public class Example3 {

    public static int x = 5; // x has global scope

    public static void main(String[] args) {
        System.out.println(x); // x can be accessed here
    }

    public static void someMethod() {
        System.out.println(x); // x can also be accessed here
    }
}
