import java.io.*;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
      String fn = "abc.txt";
        while (true) {
            try {
                FileWriter fw = new FileWriter(fn);
                fw.write("Hello World");
                fw.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
