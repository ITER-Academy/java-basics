package section4.lesson8.example1;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // calls constructor of the parent class, we will discuss it later
        this.breed = breed;
    }

    public void bark() {
        System.out.println("The dog is barking.");
    }
}
