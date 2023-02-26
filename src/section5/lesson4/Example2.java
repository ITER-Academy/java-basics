package section5.lesson4;

import java.util.LinkedList;
import java.util.Queue;

public class Example2 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue.poll()); // Output: 1
        System.out.println(queue.poll()); // Output: 2
        System.out.println(queue.poll()); // Output: 3
        System.out.println(queue.poll()); // Output: null
    }
}
