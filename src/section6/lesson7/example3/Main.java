package section6.lesson7.example3;

public class Main {

    public static void main(String[] args) {
        try {
            doSomething("");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void doSomething(String input) throws InvalidInputException {
        if (input == null || input.isEmpty()) {
            throw new InvalidInputException("Input cannot be null or empty");
        }

        // do something with the input
    }
}
