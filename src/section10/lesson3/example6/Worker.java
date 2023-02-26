package section10.lesson3.example6;

public class Worker extends Thread {

    private final Resource resource1;
    private final Resource resource2;

    public Worker(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    public void run() {
        synchronized (resource1) {
            System.out.println("Worker acquired lock on resource1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (resource2) {
                System.out.println("Worker acquired lock on resource2");
                // Do something with resource1 and resource2
            }
        }
    }
}
