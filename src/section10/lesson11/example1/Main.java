package section10.lesson11.example1;

public class Main {

    public static void main(String[] args) {
        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockExample.doSmth();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockExample.doSmth();
            }
        });
        thread1.start();
        thread2.start();
    }
}
