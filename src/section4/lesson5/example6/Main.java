package section4.lesson5.example6;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        double circlePerimeter = circle.getPerimeter();
        double circleArea = circle.getArea();
        System.out.println("circle perimeter: " + circlePerimeter);
        System.out.println("circle area: " + circleArea);
    }
}
