package section10.lesson10.example1;

public class Main {

    public static void main(String[] args) {
        ThreadLocal<Integer> myThreadLocal = new ThreadLocal<>();
        myThreadLocal.set(42);
        System.out.println("The value for this thread is " + myThreadLocal.get());
    }
}
