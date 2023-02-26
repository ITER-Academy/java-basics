package section10.lesson11.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock readLock = readWriteLock.readLock();
        Lock writeLock = readWriteLock.writeLock();

        // Thread 1
        new Thread(new Runnable() {
            @Override
            public void run() {
                readLock.lock();
                try {
                    System.out.println("Thread 1 read: " + numbers);
                } finally {
                    readLock.unlock();
                }
            }
        }).start();

        // Thread 2
        new Thread(new Runnable() {
            @Override
            public void run() {
                writeLock.lock();
                try {
                    numbers.add(1);
                    System.out.println("Thread 2 write: " + numbers);
                } finally {
                    writeLock.unlock();
                }
            }
        }).start();

        // Thread 3
        new Thread(new Runnable() {
            @Override
            public void run() {
                readLock.lock();
                try {
                    System.out.println("Thread 3 read: " + numbers);
                } finally {
                    readLock.unlock();
                }
            }
        }).start();
    }
}
