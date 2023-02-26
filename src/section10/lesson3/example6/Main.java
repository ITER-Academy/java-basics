package section10.lesson3.example6;

public class Main {

    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        Worker worker1 = new Worker(resource1, resource2);
        Worker worker2 = new Worker(resource2, resource1);

        worker1.start();
        worker2.start();
    }
}
