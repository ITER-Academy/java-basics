package section10.lesson3.example2;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    counter.increment();
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // main thread will wait until thread1 dies (finishes it's task)
            thread2.join(); // main thread will wait until thread2 dies (finishes it's task)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + counter.getCount());
    }
}
