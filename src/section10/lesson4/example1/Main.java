package section10.lesson4.example1;

public class Main {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        // interrupt the thread after some time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
