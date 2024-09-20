class th extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello 1");
        }
    }
}

class th1 extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello 2");
        }
    }
}

public class app6 {
    public static void main(String[] args) {
        System.out.println("Java Thread Methods");
        th t1 = new th();
        th1 t2 = new th1();
        t1.start();
        // Join Method...
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        // Sleep Method...
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
