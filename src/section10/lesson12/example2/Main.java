package section10.lesson12.example2;

public class Main {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running...");
            }
        };

        // Create a new ThreadGroup
        ThreadGroup myGroup = new ThreadGroup("MyGroup");

        // Create some threads and add them to the group
        Thread thread1 = new Thread(myGroup, runnable, "Thread1");
        Thread thread2 = new Thread(myGroup, runnable, "Thread2");

        // Start the threads
        thread1.start();
        thread2.start();

        // Print information about the group
        myGroup.list();
        System.out.println("Active count: " + myGroup.activeCount());
        System.out.println("Active group count: " + myGroup.activeGroupCount());

        // Interrupt all threads in the group
        myGroup.interrupt();
    }
}
