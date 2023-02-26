package section6.lesson5;

public class Example6 {

    public static void main(String[] args) {
        Object o = 5;
        String s = (String) o; // This line will throw a ClassCastException
    }
}
