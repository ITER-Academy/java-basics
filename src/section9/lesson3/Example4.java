package section9.lesson3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example4 {

    public static void main(String[] args) throws IOException {
        Writer writer = null;
        try {
            String filename = "files/section9/lesson3/output.txt";
            // create a new writer
            writer = new FileWriter(filename);
            // write characters to the output stream
            String data = "Hello, World!";
            writer.write(data);
            // flush the output stream
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // close the output stream
            if (writer != null) {
                writer.close();
            }
        }
    }
}
