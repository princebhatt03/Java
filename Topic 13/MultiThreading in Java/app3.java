class ThreadA implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello 1");
        }
    }
}

class ThreadB implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello 2");
        }
    }
}

public class app3 {
    public static void main(String[] args) {
        System.out.println("Thread using a Runnable Interface");
        ThreadA A = new ThreadA();
        Thread a = new Thread(A);
        ThreadB B = new ThreadB();
        Thread b = new Thread(B);
        // t1.start(); -> We Can't start a Runnable Thread using Interface Directly...
        // t2.start(); -> For this we have to make a New Thread Object with that
        // variable passing as a Argument...
        a.start();
        b.start();
    }
}
