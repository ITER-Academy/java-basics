package section4.lesson11.example4;

public class Main {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.myProtectedVariable);
//        System.out.println(myClass.myPrivateVariable); // cannot be accessed
    }
}
