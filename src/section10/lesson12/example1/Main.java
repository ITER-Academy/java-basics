package section10.lesson12.example1;

public class Main {

    public static void main(String[] args) {
        ThreadGroup myThreadGroup = new ThreadGroup("myThreadGroup");
        Thread myThread = new Thread(myThreadGroup, "myThread");
        System.out.println("Thread is created in group " + myThread.getThreadGroup().getName());
    }
}
