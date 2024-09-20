class ThreadX extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Hello 1");
            i++;
        }
    }
}

class ThreadY extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Hello 2");
            i++;
        }
    }
}

public class app2 {
    public static void main(String[] args) {
        System.out.println("Thread Using a Extend Class");
        ThreadX t1 = new ThreadX();
        ThreadY t2 = new ThreadY();
        t1.start();
        t2.start();
    }
}
