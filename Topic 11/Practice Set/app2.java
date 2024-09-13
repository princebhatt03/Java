abstract class pen2 {

    abstract void write();

    abstract void refil();
}

class penn2 extends pen2 {
    public void write() {
        System.out.println("Writting...");
    }

    public void refil() {
        System.out.println("Refilling...");
    }
}

abstract class fountianPen extends pen2 {
    public void changeNib() {
        System.out.println("Changing Nib");
    }
}

public class app2 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 2");
        penn2 p1 = new penn2();
    }
}
