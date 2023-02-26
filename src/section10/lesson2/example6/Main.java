package section10.lesson2.example6;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("In main thread, count is " + i);
        }
    }
}
