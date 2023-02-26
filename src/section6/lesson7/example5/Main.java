package section6.lesson7.example5;

public class Main {

    public static void main(String[] args) throws InvalidAgeException {
        printAge(-5);
    }

    private static void printAge(int age) throws InvalidAgeException {
        if (age < 1 || age > 100) {
            throw new InvalidAgeException(age);
        }
    }
}
