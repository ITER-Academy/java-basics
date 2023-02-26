package section10.lesson6.example3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                return "Hello, World!";
            }
        });

        CompletableFuture<String> future2 = future.thenApply(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s + " from CompletableFuture";
            }
        });

        System.out.println(future2.get());


        CompletableFuture<Void> future3 = future.thenAccept(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Received result: " + s);
            }
        });

        future3.get();

        CompletableFuture<Void> future4 = future.thenRun(new Runnable() {
            @Override
            public void run() {
                System.out.println("Done!");
            }
        });

        future4.get();
    }
}
