package section10.lesson5.example1;

public class OddNumberPrinter implements Runnable {

    private final Object lock;

    public OddNumberPrinter(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 1; i < 10; i += 2) {
                try {
                    lock.wait(); // Wait for the other thread to finish
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
                lock.notify(); // Notify the other thread
            }
            lock.notify(); // Notify the other thread to exit
        }
    }
}
