package section3.lesson15;

public class Example1 {

    public static void main(String[] args) {
        String str1 = "Hello"; // stored in the string constant pool
        String str2 = "Hello"; // stored in the string constant pool
        String str3 = new String("Hello"); // stored in the heap memory
        String str4 = new String("Hello"); // stored in the heap memory
        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
    }
}
