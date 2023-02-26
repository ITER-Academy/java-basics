package section10.lesson2.example1;

public class Main {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("In main thread, count is " + i);
        }
    }
}
