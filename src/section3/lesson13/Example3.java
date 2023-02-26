package section3.lesson13;

public class Example3 {

    public static void main(String[] args) {
        printHello();
        printHello("John");
    }

    public static void printHello() {
        System.out.println("Hello!");
    }

    public static void printHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
