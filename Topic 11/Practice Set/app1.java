abstract class pen {

    abstract void write();

    abstract void refil();
}

class penn extends pen {
    public void write() {
        System.out.println("Writting...");
    }

    public void refil() {
        System.out.println("Refilling...");
    }
}

public class app1 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 1");
        penn p1 = new penn();
        p1.write();
        p1.refil();
    }
}