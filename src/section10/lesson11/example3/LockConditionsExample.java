package section10.lesson11.example3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConditionsExample {

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private int count = 0;

    public void increment() throws InterruptedException {
        lock.lock();
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public void waitForCount(int target) throws InterruptedException {
        lock.lock();
        try {
            while (count < target) {
                System.out.println(Thread.currentThread().getName() + " is waiting for count to reach " + target);
                condition.await();
            }
            System.out.println(Thread.currentThread().getName() + " detected count has reached " + target);
        } finally {
            lock.unlock();
        }
    }
}
