import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MainApp {
    public static void main(String[] args) {
      String fn = "abc.txt";
      String msg = "Hello World";
      byte[] bArr = msg.getBytes();
        while (true) {
            try {
                FileOutputStream fout = new FileOutputStream(fn);
                FileChannel fc = fout.getChannel();
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                for (int i = 0; i < bArr.length; ++i) {
                    buffer.put(bArr[i]);
                }
                buffer.flip();
                fc.write(buffer);
                fc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
