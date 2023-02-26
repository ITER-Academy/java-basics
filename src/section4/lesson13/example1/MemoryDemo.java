package section4.lesson13.example1;

public class MemoryDemo {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println("Memory used by numbers array: " + Runtime.getRuntime().totalMemory());
    }
}
