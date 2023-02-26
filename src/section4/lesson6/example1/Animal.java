package section4.lesson6.example1;

public abstract class Animal {

    String name;
    int age;
    String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public abstract void makeSound();
}
