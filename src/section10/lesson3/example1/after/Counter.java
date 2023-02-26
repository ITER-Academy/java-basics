package section10.lesson3.example1.after;

public class Counter {

    private int count;

    public int getCount() {
        return count;
    }

    public synchronized void increment() {
        count++;
    }
}
