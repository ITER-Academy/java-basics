package section9.lesson2;

import java.io.FileInputStream;
import java.io.IOException;

public class Example1 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("files/section9/lesson2/input.txt");
        int data = fis.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }
        fis.close();
    }
}
