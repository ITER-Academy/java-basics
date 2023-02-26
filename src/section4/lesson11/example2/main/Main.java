package section4.lesson11.example2.main;

//import section4.lesson11.example2.DefaultClass; // cannot be accessed from outside package
import section4.lesson11.example2.PublicClass;

public class Main {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
//        DefaultClass defaultClass = new DefaultClass(); // cannot be accessed from outside package
    }
}
