package section10.lesson2.example7;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new MyThread();
        myThread.setDaemon(true); // if this line is removed, the main thread will wait for the myThread to complete
        myThread.start();
        System.out.println("Main thread exiting...");
    }
}
