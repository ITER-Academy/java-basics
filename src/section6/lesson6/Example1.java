package section6.lesson6;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered the number " + number);
        } catch (NumberFormatException ex) {
            System.out.println("That's not a valid number.");
        }
    }
}
