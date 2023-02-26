package section10.lesson4.example2;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            // Loop for a bit to show isInterrupted() before and after calling interrupted()
            for (int i = 0; i < 1000; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread was interrupted, in loop, checking with isInterrupted().");
                    // break or handle interrupt
                }
            }

            // Handling interruption during sleep
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted during sleep.");
            }

            // Checking if the thread was interrupted using interrupted(), which clears the status
            if (Thread.interrupted()) {
                System.out.println("Thread was interrupted, checking with interrupted().");
            }

            // Checking again to demonstrate it's been cleared
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("This won't print because interrupted status is cleared.");
            } else {
                System.out.println("Thread's interrupted status is cleared after calling interrupted().");
            }
        });

        thread.start();

        // Give the thread a moment to start and run
        Thread.sleep(100);

        // Interrupt the thread
        thread.interrupt();
    }
}
