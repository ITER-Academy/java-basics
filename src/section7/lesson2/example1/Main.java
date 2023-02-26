package section7.lesson2.example1;

public class Main {

    public static void main(String[] args) {
        MyClass<String> myString = new MyClass<>("Hello World!"); // <> - is a diamond operator
//        MyClass<String> myString = new MyClass<String>("Hello World!"); // this line means the same as the line above
        System.out.println(myString.getMyVar());
    }
}
