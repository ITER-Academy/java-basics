package section10.lesson7.example5;

import java.util.concurrent.RecursiveTask;

public class FindMaxTask extends RecursiveTask<Integer> {

    private int[] arr;
    private int start;
    private int end;

    public FindMaxTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 100) {
            // Sequentially find the maximum in the array.
            int max = Integer.MIN_VALUE;
            for (int i = start; i < end; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        } else {
            // Divide the array into two halves and create subtasks to find the maximum in each half.
            int mid = start + (end - start) / 2;
            FindMaxTask leftTask = new FindMaxTask(arr, start, mid);
            FindMaxTask rightTask = new FindMaxTask(arr, mid, end);
            leftTask.fork();
            int rightResult = rightTask.compute();
            int leftResult = leftTask.join();
            // Combine the results to find the overall maximum.
            return Math.max(leftResult, rightResult);
        }
    }
}
