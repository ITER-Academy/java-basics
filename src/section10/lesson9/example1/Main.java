package section10.lesson9.example1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final Counter counter = new Counter();
        Thread[] threads = new Thread[10];  // Create 10 threads

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        counter.increment();
                    }
                }
            });
        }

        for (Thread thread : threads) {
            thread.start();  // Start each thread
        }

        for (Thread thread : threads) {
            thread.join();  // Wait for each thread to finish
        }

        System.out.println("Expected counter value: " + (threads.length * 10000));
        System.out.println("Actual counter value: " + counter.getCount());
    }
}
