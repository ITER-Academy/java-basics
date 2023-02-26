package section10.lesson2.example3;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " running (before sleep)");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " running (after sleep)");
    }
}
