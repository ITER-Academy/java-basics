package section7.lesson3.example1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("hello");
        list.add(42);

        int num = (int) list.get(0); // ClassCastException at runtime
        String str = (String) list.get(1); // ClassCastException at runtime

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hello");
        String str2 = list2.get(0); // no casting required
        System.out.println(str2);
    }
}
