package section10.lesson2.example5;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Started " + threadName);
        for (int i = 0; i < 5; i++) {
            System.out.println("In " + threadName + ", count is " + i);
        }
    }
}
