package section9.lesson3;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {

    public static void main(String[] args) throws IOException {
        String filename = "files/section9/lesson3/output.txt";
        FileOutputStream outputStream = new FileOutputStream(filename);
        String message = "Hello, world!";
        outputStream.write(message.getBytes());
        outputStream.close();
    }
}
