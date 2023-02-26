package section3.lesson16;

public class Example1 {

    public static void main(String[] args) {
        String s = "Hello World";

        int length = s.length();
        System.out.println("The length of the string is: " + length);

        char c = s.charAt(0);
        System.out.println("The first character of the string is: " + c);

        int index = s.indexOf('W');
        System.out.println("The first occurrence of 'W' is at index: " + index);
    }
}
