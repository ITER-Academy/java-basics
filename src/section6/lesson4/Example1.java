package section6.lesson4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example1 {

    public static void main(String[] args) {
        processFile("dummy.txt");
        try {
            processFile2("dummy.txt");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);
        // Read the file
        fis.close();
    }

    public static void processFile(String fileName) {
        try {
            readFile(fileName);
        } catch(IOException e) {
            // Handle the exception
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void processFile2(String fileName) throws IOException {
        readFile(fileName);
    }
}
