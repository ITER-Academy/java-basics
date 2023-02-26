package section10.lesson10.example3;

public class Main {

    public static void main(String[] args) {
        RequestProcessor processor = new RequestProcessor();

        // Create and start threads to process requests
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                processor.processRequest("Request 1");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                processor.processRequest("Request 2");
            }
        });

        thread1.start();
        thread2.start();
    }
}
