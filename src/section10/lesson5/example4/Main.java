package section10.lesson5.example4;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread t1 started running");
                try {
                    Thread.sleep(5000); // sleep for 5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread t1 finished running");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Thread t2 is running and will wait for t1 to finish or 3 seconds to elapse.");
                    t1.join(3000);
                    System.out.println("Thread t2 is running again after t1 finished or timed out.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
