package section10.lesson6.example6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5, new CustomThreadFactory());
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing in thread " + Thread.currentThread().getName());
                }
            });
        }
        executorService.shutdown();
    }
}
