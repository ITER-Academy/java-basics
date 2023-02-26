package section10.lesson6.example1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        Future<String> futureResult = executor.submit(new LongTask());

        String result = futureResult.get();
        System.out.println(result);

        executor.shutdown();
    }
}
