package section10.lesson12.example3;

public class Main {

    public static void main(String[] args) {
        Thread myThread = new Thread(new MyThread());
        myThread.setUncaughtExceptionHandler(new MyExceptionHandler());
        myThread.start();
    }
}
