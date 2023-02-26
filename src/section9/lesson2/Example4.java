package section9.lesson2;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example4 {

    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("files/section9/lesson2/input.txt");
            int data = reader.read();
            while (data != -1) {
                // do something with the data
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
