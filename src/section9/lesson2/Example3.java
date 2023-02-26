package section9.lesson2;

import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("files/section9/lesson2/input.txt");
            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
