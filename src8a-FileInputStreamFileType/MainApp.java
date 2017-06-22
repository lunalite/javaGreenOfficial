import java.io.FileInputStream;
import java.io.IOException;

public class MainApp {
    public static void main(String[] args) {
        String fn = "testImage.tar.gz";
        while (true) {
            try {
                FileInputStream fis = new FileInputStream(fn);
                fis.read();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
