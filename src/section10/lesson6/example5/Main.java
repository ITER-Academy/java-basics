package section10.lesson6.example5;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executing task");
            }
        };

        System.out.println("Scheduling task 1");
        ScheduledFuture<?> scheduledFuture = executor.schedule(task, 5, TimeUnit.SECONDS);
        scheduledFuture.get();

        System.out.println("Scheduling task 2");
        executor.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);
    }
}
