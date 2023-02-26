package section10.lesson10.example2;

public class Main {

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("Hello, world!");

        String value = threadLocal.get();
        System.out.println(value); // Output: Hello, world!
        threadLocal.remove();
    }
}
