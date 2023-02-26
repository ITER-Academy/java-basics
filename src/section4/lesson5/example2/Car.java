package section4.lesson5.example2;

public class Car implements Driveable {

    @Override
    public void start() {
        System.out.println("Car has started");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }
}
