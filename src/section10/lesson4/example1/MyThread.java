package section10.lesson4.example1;

public class MyThread extends Thread {

    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println("Doing some work");
        }
    }
}
