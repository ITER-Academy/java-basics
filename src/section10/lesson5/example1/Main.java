package section10.lesson5.example1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Create a shared lock object
        Object lock = new Object();

        // Create the even and odd number printer threads
        Thread oddNumberPrinterThread = new Thread(new OddNumberPrinter(lock));
        Thread evenNumberPrinterThread = new Thread(new EvenNumberPrinter(lock));

        // Start the threads
        oddNumberPrinterThread.start();
        evenNumberPrinterThread.start();
    }
}
