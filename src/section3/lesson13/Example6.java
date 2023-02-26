package section3.lesson13;

public class Example6 {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before calling the method, x = " + x);
        changeValue(x);
        System.out.println("After calling the method, x = " + x);
    }

    public static void changeValue(int num) {
        num = num + 10;
        System.out.println("Inside the method, num = " + num);
    }
}
