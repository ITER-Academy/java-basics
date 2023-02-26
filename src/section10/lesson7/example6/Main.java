package section10.lesson7.example6;

import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        MyRecursiveTask task = new MyRecursiveTask(1, 100);

        int result = pool.invoke(task);

        System.out.println(result);
    }
}
