package section4.lesson5.example6;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car(120.0);
        myCar.printSpeed();
        System.out.println("Fuel Type: " + myCar.getFuelType());
    }
}
