package section10.lesson11.example3;

public class Main {

    public static void main(String[] args) {
        LockConditionsExample example = new LockConditionsExample();
        int target = 5;

        // Create a thread to wait for the count to reach the target value
        Thread waiter = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    example.waitForCount(target);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Waiter");

        // Create threads to increment the count
        Thread incrementer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 3; i++) {
                        example.increment();
                        Thread.sleep(100); // Sleep to simulate some work
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Incrementer1");

        Thread incrementer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 3; i++) {
                        example.increment();
                        Thread.sleep(100); // Sleep to simulate some work
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Incrementer2");

        // Start the threads
        waiter.start();
        incrementer1.start();
        incrementer2.start();
    }
}
