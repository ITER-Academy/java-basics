package section10.lesson6.example4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing task " + taskNumber + " by thread " + Thread.currentThread().getName());
                }
            });
        }
        executorService.shutdown();
    }
}
