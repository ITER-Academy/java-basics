package section3.lesson13;

public class Example9 {

    public static void main(String[] args) {
        printNumbers();
        printNumbers(5);
        printNumbers(1, 2, 3, 4, 5);
    }

    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
