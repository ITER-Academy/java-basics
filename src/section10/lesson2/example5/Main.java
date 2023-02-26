package section10.lesson2.example5;

public class Main {

    public static void main(String[] args) {
        Thread t0 = new Thread(new MyRunnable());
        Thread t1 = new Thread(new MyRunnable());
        t0.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t0.start();
        t1.start();
    }
}
