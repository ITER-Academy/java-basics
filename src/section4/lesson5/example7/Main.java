package section4.lesson5.example7;

public class Main {

    public static void main(String[] args) {
        Shape circle = Shape.createCircle(5);
        double circleArea = circle.getArea();
        System.out.println("circle area: " + circleArea);
    }
}
