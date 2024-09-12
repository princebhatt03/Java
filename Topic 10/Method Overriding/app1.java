class parentClass {
    public int a;

    public int func1() {
        return 1;
    }

    public void func2() {
        System.out.println("I am Parent's Method 2");
    }
}

class childClass extends parentClass {
    @Override
    public void func2() {
        System.out.println("I am Child's Method 1");
    }
}

public class app1 {
    public static void main(String[] args) {
        System.out.println("Method Overriding in Java...");
        parentClass a = new parentClass();
        a.func2();
        childClass b = new childClass();
        b.func2();
    }
}