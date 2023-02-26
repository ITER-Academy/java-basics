package section5.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        List<String> myArrayList = new ArrayList<>();

        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Cherry");
        System.out.println("Source list: " + myArrayList);

        myArrayList.add(1, "Blueberry");
        System.out.println("List with 'Blueberry': " + myArrayList);

        myArrayList.remove(1);
        System.out.println("List without 2nd element: " + myArrayList);

        myArrayList.remove("Banana");
        System.out.println("List without 'Banana': " + myArrayList);

        String secondElement = myArrayList.get(1);
        System.out.println("Second element: " + secondElement);

        int indexOfCherry = myArrayList.indexOf("Cherry");
        System.out.println("Index of 'Cherry': " + indexOfCherry);

        boolean containsCherry = myArrayList.contains("Cherry");
        System.out.println("Flag that determines if 'Cherry' exists: " + containsCherry);
    }
}
