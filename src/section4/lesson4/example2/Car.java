package section4.lesson4.example2;

public class Car {

    private String make;
    private String model;
    private int year;

    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("make: " + make);
        System.out.println("model: " + model);
        System.out.println("year: " + year);
    }
}
