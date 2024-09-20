class thread1 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("Good Morning...");
            i++;
        }
    }
}

class thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("Welcome...");
            i++;
        }
    }
}

public class app1 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 1 and Question 2");
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        try {
            t2.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}