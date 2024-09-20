class thread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println("Hello 1");
        }
    }
}

class thread4 extends Thread {
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println("Hello 2");
        }
    }
}

public class app2 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 3");
        thread3 t1 = new thread3();
        thread4 t2 = new thread4();
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        System.out.println(t2.getPriority());
    }
}
