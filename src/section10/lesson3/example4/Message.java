package section10.lesson3.example4;

public class Message {

    private String message;

    public synchronized String getMessage() {
        while (message == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String msg = message;
        message = null;
        notifyAll();
        return msg;
    }

    public synchronized void setMessage(String message) {
        while (this.message != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = message;
        notifyAll();
    }
}
