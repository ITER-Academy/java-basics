package section4.lesson2.example1;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "John";
        person1.age = 30;

        person2.name = "Jane";
        person2.age = 25;

        System.out.println("Person1 name: " + person1.name);
        System.out.println("Person1 age: " + person1.age);

        System.out.println("Person2 name: " + person2.name);
        System.out.println("Person2 age: " + person2.age);
    }
}
