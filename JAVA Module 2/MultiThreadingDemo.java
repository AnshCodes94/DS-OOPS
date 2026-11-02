class ChildThread extends Thread {
    public void run() {
       for (int i = 0; i < 20; i++) {
            System.out.println("child "+ i);
        }
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        ChildThread obj = new ChildThread();
        obj.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main "+ i);
        }
    }
}