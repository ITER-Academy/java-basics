package section4.lesson5.example3;

public class Rectangle implements Drawable, Movable {

    @Override
    public void draw() {
        System.out.println("drawing a rectangle");
    }

    @Override
    public void move() {
        System.out.println("moving a rectangle");
    }
}
