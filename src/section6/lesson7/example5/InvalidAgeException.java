package section6.lesson7.example5;

public class InvalidAgeException extends Exception {

    private int age;

    public InvalidAgeException(int age) {
        super("Invalid age: " + age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getMessage() {
        return "Invalid age: " + age + ". Age must be between 1 and 100.";
    }
}
