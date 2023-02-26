package section4.lesson13.example2;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("World");
        s1 = s2;
        s2 = null;
    }
}
