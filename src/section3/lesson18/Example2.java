package section3.lesson18;

public class Example2 {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }
    }
}
