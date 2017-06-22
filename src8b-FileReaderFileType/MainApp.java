import java.io.FileReader;
import java.io.IOException;

public class MainApp {
    public static void main(String[] args) {
        String fn = "testImage.mp4";
        while (true) {
            try {
                FileReader fr = new FileReader(fn);
                fr.read();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
