class first {
    public void phone() {
        System.out.println("Nokia 1100");
    }

    public void on() {
        System.out.println("Turning on Phone");
    }
}

class second extends first {
    public void smartPhone() {
        System.out.println("Samsung S20 Ultra");
    }

    @Override
    public void on() {
        System.out.println("Turning on SmartPhone");
    }
}

public class app3 {
    public static void main(String[] args) {
        System.out.println("Dynamic Method Dispatch / Runtime Polymorphism...");
        // second b = new first(); : Not Allowed...
        first a = new second();
        a.phone();
        a.on();
        // a.smartPhone(); : Not Allowed...
    }
}