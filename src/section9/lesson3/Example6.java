package section9.lesson3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Example6 {

    public static void main(String[] args) {
        String data = "This is the data that will be written to the network.";
        try {
            Socket socket = new Socket("sdf.org", 23);
            OutputStream outputStream = socket.getOutputStream();
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
            outputStream.close();
            socket.close();
            System.out.println("Data written to network.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
