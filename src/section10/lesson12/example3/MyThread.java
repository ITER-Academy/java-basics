package section10.lesson12.example3;

public class MyThread implements Runnable {

    public void run() {
        // Do some work
        throw new RuntimeException("Oops, something went wrong");
    }
}
