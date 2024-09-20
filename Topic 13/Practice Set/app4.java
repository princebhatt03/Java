class threadA extends Thread {
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println("Hello 1");
        }
    }
}

public class app4 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 5");
        threadA t1 = new threadA();
        t1.start();
        System.out.println(Thread.currentThread().getState());
    }
}
