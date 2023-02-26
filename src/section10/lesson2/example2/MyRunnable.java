package section10.lesson2.example2;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("In MyRunnable, count is " + i);
        }
    }
}
