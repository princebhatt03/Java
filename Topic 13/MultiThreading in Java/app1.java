class MyThread1 extends Thread {
    // @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("My Thread is Running...");
            System.out.println("My Thread runned...");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    // @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("My Thread2 is Running...");
            System.out.println("My Thread2 runned...");
            i++;
        }
    }
}

public class app1 {
    public static void main(String[] args) {
        System.out.println("MultiThreading in Java");
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}