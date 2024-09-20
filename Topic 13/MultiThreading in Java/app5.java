class thr1 extends Thread {
    public thr1(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello" + this.getName());
        }
    }
}

public class app5 {
    public static void main(String[] args) {
        System.out.println("Thread Priority");
        thr1 t1 = new thr1("Prince");
        thr1 t2 = new thr1("Vanshi");
        thr1 t3 = new thr1("Virat");
        thr1 t4 = new thr1("Rohit");
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
