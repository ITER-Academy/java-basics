package section4.lesson5.example5;

public class DomesticDog implements Domestic {

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void beFriendly() {
        System.out.println("I'm friendly dog");
    }

    @Override
    public void goHome() {
        System.out.println("Going home");
    }
}
