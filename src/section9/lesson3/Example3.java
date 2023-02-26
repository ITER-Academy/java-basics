package section9.lesson3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Example3 {

    public static void main(String[] args) throws IOException {
        OutputStream os = null;
        try {
            String filename = "files/section9/lesson3/output.txt";
            // create a new output stream
            os = new FileOutputStream(filename);
            // write bytes to the output stream
            String data = "Hello, World!";
            byte[] bytes = data.getBytes();
            os.write(bytes);
            // flush the output stream
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // close the output stream
            if (os != null) {
                os.close();
            }
        }
    }
}
