package section7.lesson2.example1;

public class MyClass<T> {

    private T myVar;

    public MyClass(T myVar) {
        this.myVar = myVar;
    }

    public T getMyVar() {
        return myVar;
    }

    public void setMyVar(T myVar) {
        this.myVar = myVar;
    }
}
