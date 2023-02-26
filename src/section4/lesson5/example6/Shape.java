package section4.lesson5.example6;

public interface Shape {

    double getArea();

    default double getPerimeter() {
        return 2 * (Math.sqrt(2) * getArea());
    }
}
