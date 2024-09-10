class parent1 {
    int x;

    parent1() {
        System.out.println("I am Parent's Constructor");
    }

    public void set(int val) {
        this.x = val;
    }

    public int get() {
        System.out.println(x);
        return x;
    }
}

class child1 extends parent1 {
    int y;

    child1() {
        System.out.println("I am Child's Constructor");
    }

    public void set1(int val) {
        this.y = val;
    }

    public int get1() {
        System.out.println(y);
        return y;
    }
}

public class app4 {
    public static void main(String[] args) {
        System.out.println("Constructor in Inheritance");
        parent1 p1 = new parent1();
        child1 p2 = new child1();
        p1.set(5);
        p1.get();
        // Since Constructor can invoke with the child class...
        // If child class has its own Constructor then both CON will invoke (1st
        // Parent's CON then Child's CON)
        p2.set1(6);
        p2.get1();
    }
}
