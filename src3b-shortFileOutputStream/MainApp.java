import java.io.*;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        String fn = "abc.txt";
        String msg = "Hello World";
        byte[] bArr = msg.getBytes();
        while (true) {
            try {
                FileOutputStream fos = new FileOutputStream(fn);
                fos.write(bArr);
                fos.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
