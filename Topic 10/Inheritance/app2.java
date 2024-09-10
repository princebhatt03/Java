class vehicle {
    boolean truck;

    public void set(boolean run) {
        truck = run;
    }

    public boolean get() {
        System.out.println("Truck Running: " + truck);
        return truck;
    }
}

class car extends vehicle {
    boolean car;

    public void set1(boolean run1) {
        car = run1;
    }

    public boolean get1() {
        System.out.println("Car Running: " + car);
        return car;
    }
}

class bike extends vehicle {
    boolean bike;

    public void set2(boolean run1) {
        bike = run1;
    }

    public boolean get2() {
        System.out.println("Bike Running: " + bike);
        return bike;
    }
}

public class app2 {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        vehicle v1 = new vehicle();
        car v2 = new car();
        bike v3 = new bike();
        v1.set(true);
        v1.get();
        v2.set1(true);
        v2.get1();
        v3.set(true);
        v3.get();
        v3.set2(false);
        v3.get2();

    }
}
