package section4.lesson5.example7;

public interface Shape {

    double getArea();

    static Shape createCircle(double radius) {
        return new Circle(radius);
    }
}
