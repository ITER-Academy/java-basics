package section10.lesson4.example3;

public class Main {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
    }
}
