package section4.lesson12.example5.after;

public class Main {

    public static void main(String[] args) {
        RegularEngine regularEngine = new RegularEngine();
        TurboEngine turboEngine = new TurboEngine();

        Car regularCar = new Car(regularEngine);
        regularCar.startEngine();

        Car turboCar = new Car(turboEngine);
        turboCar.startEngine();
    }
}
