import java.io.*;

public class MainApp {
    public static void main(String[] args) {
        String fn = "abc.txt";
        String line = "";
        try {
            while (true) {
                FileWriter fw = new FileWriter(fn);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Hello World");
                bw.close();
                FileReader fr = new FileReader(fn);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
