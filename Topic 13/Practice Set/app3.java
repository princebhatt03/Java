class thread5 extends Thread {
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println("Hello 1");
        }
    }
}

class thread6 extends Thread {
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println("Hello 2");
        }
    }
}

public class app3 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 4");
        thread5 t1 = new thread5();
        t1.start();
        System.out.println(t1.getState());
    }
}
