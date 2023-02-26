package section10.lesson7.example3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

public class Main {

    public static void main(String[] args) {
        // Default Constructor
        ForkJoinPool fjPool = new ForkJoinPool();

        // Constructor with parallelism level
        int parallelismLevel = 5;
        ForkJoinPool fjPool2 = new ForkJoinPool(parallelismLevel);

        // Constructor with ForkJoinWorkerThreadFactory
        ForkJoinWorkerThreadFactory threadFactory = new CustomThreadFactory();
        ForkJoinPool fjPool3 = new ForkJoinPool(parallelismLevel, threadFactory, null, true);
    }
}
