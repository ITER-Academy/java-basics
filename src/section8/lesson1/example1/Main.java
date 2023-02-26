package section8.lesson1.example1;

public class Main {

    public static void main(String[] args) {
        ShapeType circle = ShapeType.CIRCLE;
        ShapeType square = ShapeType.SQUARE;
        ShapeType triangle = ShapeType.TRIANGLE;

        System.out.println(circle);
        System.out.println(square);
        System.out.println(triangle);

//        ShapeType rectangle = ShapeType.RECTANGLE; // This will result in a compile-time error
    }
}
