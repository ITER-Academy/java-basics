package section10.lesson3.example5;

public class MyThread extends Thread {

    private final Object monitor;

    public MyThread(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        synchronized (monitor) {
            System.out.println("Thread " + getId() + " before wait()");
            try {
                monitor.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + getId() + " after wait()");
        }
    }
}
