class parent2 {
    parent2() {
        System.out.println("I am Parent's Constructor");
    }

    parent2(int a) {
        System.out.println("I am Parent's Overloaded Constructor with val a: " + a);
    }
}

class child2 extends parent2 {
    child2() {
        // super(16);
        System.out.println("I am Child's Constructor");
    }

    child2(int a, int b) {
        super(a);
        System.out.println("I am Child's Overloaded Constructor with val b: " + b);
    }
}

class grandChild extends child2 {
    grandChild() {
        System.out.println("I am GrandChild's Constructor");
    }

    grandChild(int a, int b, int c) {
        super(a, b);
        System.out.println("I am GrandChild's Overloaded Constructor with val c: " + c);
    }
}

public class app5 {
    public static void main(String[] args) {
        System.out.println("Constructor in Inheritance");
        // parent2 p1 = new parent2();
        child2 p2 = new child2(3, 16);
        // Since Constructor can invoke with the child class...
        // If child class has its own Constructor then both CON will invoke (1st
        // Parent's CON then Child's CON)
        grandChild c1 = new grandChild(12, 13, 15);
    }
}

// Super Keyword is used to Invoke the Parent's Overloaded Constructor...