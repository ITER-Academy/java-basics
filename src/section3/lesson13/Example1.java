package section3.lesson13;

public class Example1 {

    public static void main(String[] args) {
        double radius = 3;
        double circleArea = calculateCircleArea(radius);
        System.out.println(circleArea);
    }

    public static double calculateCircleArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }
}
