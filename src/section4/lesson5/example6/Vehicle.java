package section4.lesson5.example6;

public interface Vehicle {

    double getSpeed();

    default String getFuelType() {
        return "Petrol";
    }

    default void printSpeed() {
        System.out.println("The speed is: " + getSpeed());
    }
}
