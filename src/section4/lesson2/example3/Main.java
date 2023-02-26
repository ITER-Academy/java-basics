package section4.lesson2.example3;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.modelYear = 1969;
        myCar.modelName = "Mustang";
        Car anotherCar = myCar;

        System.out.println("myCar modelName: " + myCar.modelName);
        System.out.println("myCar modelYear: " + myCar.modelYear);
        System.out.println("anotherCar modelName: " + anotherCar.modelName);
        System.out.println("anotherCar modelYear: " + anotherCar.modelYear);

        myCar = new Car();
        myCar.modelYear = 2010;
        myCar.modelName = "Camaro";

        System.out.println("myCar modelName: " + myCar.modelName);
        System.out.println("myCar modelYear: " + myCar.modelYear);
        System.out.println("anotherCar modelName: " + anotherCar.modelName);
        System.out.println("anotherCar modelYear: " + anotherCar.modelYear);
    }
}
