package section4.lesson4.example5;

public class Rectangle {

    int width;
    int height;

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printInfo() {
        System.out.println("width = " + width + ", height = " + height);
    }
}
