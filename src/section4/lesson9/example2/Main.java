package section4.lesson9.example2;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal();

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("Dog object");
            } else if (animal instanceof Cat) {
                System.out.println("Cat object");
            } else {
                System.out.println("Animal object");
            }
            animal.makeSound();
        }
    }
}
