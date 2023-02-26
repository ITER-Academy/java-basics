package section10.lesson4.example4;

public class LongTask implements Runnable {

    private volatile boolean stop = false;

    @Override
    public void run() {
        while (!stop) {
            // perform long-running task
            try {
                // block on I/O
                System.out.println("Sleeping for 1 second");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        System.out.println("Stopping");
        stop = true;
    }
}
