package section9.lesson2;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example5 {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://example.com");
            InputStream inputStream = url.openStream();
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
