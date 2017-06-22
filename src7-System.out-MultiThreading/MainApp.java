class ThreadObj implements Runnable {
    private Thread t;
    private String threadName;

    ThreadObj(String name) {
        threadName = name;
    }

    public void run() {
        while (true) {
            System.out.println(threadName);
        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class MainApp {
    public static void main(String args[]) {
        ThreadObj t1 = new ThreadObj("1");
        ThreadObj t2 = new ThreadObj("2");
        t1.start();
        t2.start();
    }
}
