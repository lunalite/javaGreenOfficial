import java.io.*;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        String fn = "abc.txt";
        String line = "";
        RandomString r = new RandomString(10);
        try {
            while (true) {
                FileWriter fw = new FileWriter(fn);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(r.nextString());
                bw.close();
                FileReader fr = new FileReader(fn);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class RandomString {
// Code obtained from https://stackoverflow.com/questions/41107/how-to-generate-a-random-alpha-numeric-string

    private static final char[] symbols;

    static {
        StringBuilder tmp = new StringBuilder();
        for (char ch = '0'; ch <= '9'; ch++) {
            tmp.append(ch);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            tmp.append(ch);
        }
        symbols = tmp.toString().toCharArray();
    }

    private final Random random = new Random();

    private final char[] buf;

    public RandomString(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("length < 1: " + length);
        }
        buf = new char[length];
    }

    public String nextString() {
        for (int i = 0; i < buf.length; i++) {
            buf[i] = symbols[random.nextInt(symbols.length)];
        }
        return new String(buf);
    }
}
