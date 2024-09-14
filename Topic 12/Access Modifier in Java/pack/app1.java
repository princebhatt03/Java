package pack;

class c1 {
    public int x = 166;
    protected int y = 3;
    int v = 16;
    private int p = 33;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(v);
        System.out.println(p);
    }
}

class c2 extends c1 {
    public void meth2() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(v);
        // System.out.println(p); : Can't Access...
    }
}

public class app1 {
    public static void main(String[] args) {
        System.out.println("Access Modifier in Java");
        // Using in same class...
        c1 c = new c1();
        c.meth1();
        // Using in same Package...
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.v);
        // System.out.println(c.p); : Private Can't access in same Package...
        // Using in same subClass Above...
        // Using in World...
        // We can only Access the Public variables...
    }
}