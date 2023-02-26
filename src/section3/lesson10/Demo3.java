package section3.lesson10;

public class Demo3 {

    public static void main(String[] args) {
        int age = 25;

        if (age >= 18) {
            if (age >= 21) {
                System.out.println("You can legally drink alcohol.");
            } else {
                System.out.println("You can vote, but not drink alcohol.");
            }
        } else {
            System.out.println("You are not old enough to vote or drink alcohol.");
        }
    }
}
