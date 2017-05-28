import java.io.*;

public class MainApp {
  public static void main(String[] args) {
    while (true) {
      String fn = "abc.txt";
      try {
        FileWriter fw = new FileWriter(fn);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello World");
        bw.close();
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
  }

}
