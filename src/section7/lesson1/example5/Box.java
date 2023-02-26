package section7.lesson1.example5;

public class Box<T extends Comparable<T>> {

    private T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    public int compareTo(Box<T> otherBox) {
        return object.compareTo(otherBox.get());
    }
}
