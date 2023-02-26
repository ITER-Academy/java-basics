package section10.lesson4.example4;

public class Main {

    public static void main(String[] args) {
        LongTask task = new LongTask();
        Thread taskThread = new Thread(task);
        taskThread.start();

        // wait a bit
        try {
            System.out.println("Sleeping for 5 seconds");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // stop the task thread
        task.stop();
    }
}
