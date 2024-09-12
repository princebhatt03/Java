abstract class base {
    public base() {
        System.out.println("I am Constructor of Base");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class derived extends base {
    @Override
    public void greet() {
        System.out.println("Good Morning...");
    }
}

class derived2 extends base {
    public void th() {
        System.out.println("Prince");
    }

    @Override
    public void greet() {
        System.out.println("Hello");
    }
}

public class app1 {
    public static void main(String[] args) {
        System.out.println("Abstract Classes and Methods...");
        // Abstract Method that is Decalared without an implementation...
        // Abstract class is that class whose object cannot be created...
        // base b = new base(); : Not Allowwed...
    }
}