package section10.lesson3.example5;

public class Main {

    public static void main(String[] args) {
        Object monitor = new Object();

        for (int i = 0; i < 5; i++) {
            MyThread t = new MyThread(monitor);
            t.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (monitor) {
            monitor.notify(); // if this line is updated to `monitor.notifyAll()`, then all threads will be awakened
        }
    }
}
