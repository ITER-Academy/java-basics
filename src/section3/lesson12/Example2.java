package section3.lesson12;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = -1;
        while (age <= 0) {
            System.out.print("Enter your age: ");
            age = input.nextInt();
            if (age <= 0) {
                System.out.println("Invalid age. Please enter a positive value.");
            }
        }
    }
}
