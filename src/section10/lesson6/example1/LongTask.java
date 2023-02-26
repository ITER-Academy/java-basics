package section10.lesson6.example1;

import java.util.concurrent.Callable;

public class LongTask implements Callable<String> {

    public String call() throws Exception {
        // Long computation here
        return "Result of long task";
    }
}
