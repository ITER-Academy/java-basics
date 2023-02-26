package section10.lesson3.example3;

public class Counter {

    private final Object lock = new Object(); // monitor should be final
    private int count;

    public void increment() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        synchronized (lock) {
            return count;
        }
    }
}
