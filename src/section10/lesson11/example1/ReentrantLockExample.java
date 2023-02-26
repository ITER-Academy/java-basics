package section10.lesson11.example1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final Lock lock = new ReentrantLock();

    public void doSmth() {
        lock.lock();
        System.out.println("Locked for thread " + Thread.currentThread().getName());
        try {
            // critical section of code
            System.out.println("Within lock for thread " + Thread.currentThread().getName());
        } finally {
            System.out.println("Unlocking for thread " + Thread.currentThread().getName());
            lock.unlock();
        }
    }
}
