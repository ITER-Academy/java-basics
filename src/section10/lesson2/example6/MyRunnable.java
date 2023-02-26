package section10.lesson2.example6;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("In MyRunnable, count is " + i);
            Thread.yield();
        }
    }
}
