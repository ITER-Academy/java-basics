package section9.lesson3;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example5 {

    public static void main(String[] args) {
        String data = "Hello, World!";
        try {
            String filename = "files/section9/lesson3/output.txt";
            FileOutputStream fos = new FileOutputStream(filename);
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            fos.close();
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
