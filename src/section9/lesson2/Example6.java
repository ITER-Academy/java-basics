package section9.lesson2;

import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.printf("Your name is %s and your age is %d", name, age);
    }
}
