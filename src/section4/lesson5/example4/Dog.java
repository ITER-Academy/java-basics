package section4.lesson5.example4;

public class Dog implements Mammal {

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void giveBirth() {
        System.out.println("Dog gives birth");
    }
}
