class thr extends Thread {
    public thr(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am Thread 1");
            i++;
        }
    }
}

public class app4 {
    // @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println("Thread Using Constructor");
        thr t1 = new thr("Prince");
        t1.start();
        thr t2 = new thr("Vanshi");
        t2.start();
        System.out.println("The id of Thread t1 is: " + t1.getId());
        System.out.println("The Name of Thread t1 is: " + t1.getName());
        System.out.println("The Priority of Thread t1 is: " + t1.getPriority());
        System.out.println("The id of Thread t2 is: " + t2.getId());
        System.out.println("The Name of Thread t2 is: " + t2.getName());
        System.out.println("The Priority of Thread t2 is: " + t2.getPriority());
        System.out.println("The Priority of Thread t2 is: " + t2.getClass());
    }
}
