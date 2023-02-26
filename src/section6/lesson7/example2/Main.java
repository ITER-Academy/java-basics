package section6.lesson7.example2;

public class Main {

    public static void main(String[] args) {
        try {
            doSomethingAndThrowCustomException();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        doSomethingAndThrowCustomRuntimeException();
    }

    private static void doSomethingAndThrowCustomException() throws CustomException {
        // do something
        throw new CustomException();
    }

    private static void doSomethingAndThrowCustomRuntimeException() {
        // do something
        throw new CustomRuntimeException();
    }
}
