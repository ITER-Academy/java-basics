package section9.lesson3;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {

    public static void main(String[] args) throws IOException {
        String filename = "files/section9/lesson3/output.txt";
        FileOutputStream outputStream = new FileOutputStream(filename);
        String message = "Hello, world!";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        bufferedOutputStream.write(message.getBytes());
        bufferedOutputStream.flush();
    }
}
