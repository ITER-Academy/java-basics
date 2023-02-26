package section7.lesson1.example4;

public class Main {

    public static void main(String[] args) {
        String str = "Hello, world!";
        String strResult = identity(str);
        System.out.println(strResult);

        Integer num = 42;
        Integer numResult = identity(num);
        System.out.println(numResult);
    }

    private static <T> T identity(T value) {
        return value;
    }
}
