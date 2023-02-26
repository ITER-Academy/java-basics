package section4.lesson12.example3;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        makeAnimalMove(bird);
    }

    private static void makeAnimalMove(Animal animal) {
        animal.move();
    }
}
