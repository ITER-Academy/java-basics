package section7.lesson3.example2;

public class Main {

    public static void main(String[] args) {
        Example<String> example = new Example<>();
        example.setValue("hello");

        ((Example) example).setValue(123);

        Object objectValue = example.getValue();
        System.out.println(objectValue);

        String stringValue = example.getValue(); // ClassCastException
        System.out.println(stringValue);
    }
}
