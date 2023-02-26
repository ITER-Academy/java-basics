package section10.lesson5.example1;

public class EvenNumberPrinter implements Runnable {

    private final Object lock;

    public EvenNumberPrinter(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i += 2) {
                System.out.println(i);
                lock.notify(); // Notify the other thread
                try {
                    lock.wait(); // Wait for the other thread to finish
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.notify(); // Notify the other thread to exit
        }
    }
}
