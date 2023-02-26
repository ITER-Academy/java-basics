package section10.lesson6.example2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submitting some tasks to the executor
        executor.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Task 1 is running: " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        executor.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Task 2 is running: " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        // Initiating the shutdown
        executor.shutdown();

        // This task will throw RejectedExecutionException as the executor has been shut down
//        executor.submit(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Task 3 is running");
//            }
//        });

        // Waiting for the termination of the ExecutorService
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Once the ExecutorService has terminated, this line will be printed
        System.out.println("Executor terminated successfully");
    }
}
