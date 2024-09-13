interface parent {
    void meth1();

    void meth2();
}

interface child extends parent {
    void meth3();

    void meth4();
}

class subChild implements child {
    public void meth1() {
        System.out.println("Method 1");
    }

    public void meth2() {
        System.out.println("Method 2");
    }

    public void meth3() {
        System.out.println("Method 3");
    }

    public void meth4() {
        System.out.println("Method 4");
    }
}

public class app2 {
    public static void main(String[] args) {
        System.out.println("Inheritance in Interfaces");
        subChild c1 = new subChild();
        c1.meth1();
        c1.meth2();
        c1.meth3();
        c1.meth4();
    }
}
