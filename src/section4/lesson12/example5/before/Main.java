package section4.lesson12.example5.before;

public class Main {

    public static void main(String[] args) {
        RegularEngine regularEngine = new RegularEngine();
        TurboEngine turboEngine = new TurboEngine();

        Car car1 = new Car(regularEngine);
        car1.startEngine();

//        Car car2 = new Car(turboEngine); // not able to create a car with a different engine
    }
}
