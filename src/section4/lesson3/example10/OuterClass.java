package section4.lesson3.example10;

public class OuterClass {

    public void printMessage() {
        class LocalInnerClass {

            public void printMessage() {
                System.out.println("Hello from the local inner class");
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.printMessage();
    }
}
