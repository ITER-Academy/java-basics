package section3.lesson18;

public class Example4 {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        if (str1.compareTo(str2) == 0) {
            System.out.println("The strings are equal");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println("The first string is greater than the second");
        } else {
            System.out.println("The first string is less than the second");
        }
    }
}
