package section10.lesson6.example6;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {

    private int counter = 0;

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setName("CustomThread-" + counter++);
        t.setPriority(Thread.MAX_PRIORITY);
        t.setDaemon(true);
        return t;
    }
}
