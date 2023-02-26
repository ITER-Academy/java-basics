package section10.lesson7.example4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] array = {1, 2, 3, 4};

        // create a ForkJoinPool
        ForkJoinPool fjPool = new ForkJoinPool();

        // print parallelism
        int parallelism = fjPool.getParallelism();
        System.out.println("parallelism = " + parallelism);

        // invoke
        SumTask task1 = new SumTask(array, 0, array.length);
        System.out.println("before invoke");
        int result1 = fjPool.invoke(task1);
        System.out.println("after invoke");
        System.out.println("invoke result = " + result1);

        // execute
        SumTask task2 = new SumTask(array, 0, array.length);
        System.out.println("before execute");
        fjPool.execute(task2);
        System.out.println("after execute");

        // submit
        SumTask task3 = new SumTask(array, 0, array.length);
        System.out.println("before submit");
        Future<Integer> result2 = fjPool.submit(task3);
        System.out.println("after submit");
        System.out.println("submit result = " + result2.get());

        // shutdown
        fjPool.shutdown();

        // await termination
        fjPool.awaitTermination(1, TimeUnit.MINUTES);
    }
}
