package section10.lesson3.example4;

public class Main {

    public static void main(String[] args) {
        // Create a shared Message object
        Message message = new Message();

        // Create a producer thread
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                String[] messages = {"Hello", "World", "in", "Java"};

                for (String msg : messages) {
                    try {
                        Thread.sleep(1000); // Simulate some delay in message production
                        message.setMessage(msg);
                        System.out.println("Produced: " + msg);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                // Signal completion
                message.setMessage("DONE");
            }
        });

        // Create a consumer thread
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (String msg = message.getMessage(); !msg.equals("DONE"); msg = message.getMessage()) {
                    System.out.println("Consumed: " + msg);
                }
            }
        });

        // Start both threads
        producer.start();
        consumer.start();

        // Wait for both threads to finish
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
