package section10.lesson10.example3;

public class RequestProcessor {

    // ThreadLocal variable to hold data specific to each thread
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<String>() {
        @Override
        protected String initialValue() {
            return "Initial Request Data";
        }
    };

    public void processRequest(String request) {
        // Get the data for the current thread
        String context = threadLocal.get();

        // Process the request using the thread-specific data
        System.out.println("Processing request: " + request + " with context: " + context);

        // Optionally modify the thread-local data
        threadLocal.set("Processed Request Data");
    }
}
