package section6.lesson7.example2;

public class CustomRuntimeException extends RuntimeException {

    public CustomRuntimeException() {
        super("This is a custom runtime exception.");
    }
}
