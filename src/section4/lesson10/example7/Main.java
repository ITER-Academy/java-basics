package section4.lesson10.example7;

public class Main {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld() {
            @Override
            void greet() {
                System.out.println("Hello from anonymous class");
            }
        };

        helloWorld.greet();
    }
}
