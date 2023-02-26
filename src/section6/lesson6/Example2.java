package section6.lesson6;

public class Example2 {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        int index = 4;
        String name = null;

        if (index >= 0 && index < names.length) {
            name = names[index];
        } else {
            name = "Unknown";
        }

        System.out.println("The name at index " + index + " is " + name);
    }
}
