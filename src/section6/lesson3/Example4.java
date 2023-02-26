package section6.lesson3;

public class Example4 {

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception caught");
        } finally {
            System.out.println("Finally");
        }
    }
}
