package section10.lesson2.example7;

public class MyThread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("MyThread is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
