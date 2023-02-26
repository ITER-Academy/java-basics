package section10.lesson2.example4;

public class Main {

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadStatesExample());

        System.out.println("Thread state: " + t.getState()); // NEW

        t.start();

        System.out.println("Thread state: " + t.getState()); // RUNNABLE

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state: " + t.getState()); // TERMINATED
    }
}
