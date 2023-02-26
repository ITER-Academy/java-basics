package section4.lesson4.example3;

public class Car {

    private String make;
    private String model;
    private int year;

    // Default constructor

    // Under the hood, Java will generate the following constructor
//    public Car() {
//        this.make = null;
//        this.model = null;
//        this.year = 0;
//    }

    public void printInfo() {
        System.out.println("make: " + make);
        System.out.println("model: " + model);
        System.out.println("year: " + year);
    }
}
