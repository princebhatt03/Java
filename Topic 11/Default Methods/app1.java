interface rollRocye {
    void looks();

    private void greet() {
        System.out.println("Hello");
    }

    // Default Methods in Java
    default void customCar() {
        System.out.println("Roll Royce is a Custom Car");
        greet();
    }
}

interface audi {
    void speed();
}

class car {
    void normalCar() {
        System.out.println("I am a Normal Car");
    }
}

class sportsCar extends car implements rollRocye, audi {
    public void looks() {
        System.out.println("Good Looks");
    }

    // public void customCar() {
    // System.out.println("Roll Royce Custom Car 2");
    // }

    public void speed() {
        System.out.println("Good Speed");
    }

}

public class app1 {
    public static void main(String[] args) {
        System.out.println("Default Methods");
        sportsCar s1 = new sportsCar();
        s1.looks();
        s1.normalCar();
        s1.speed();
        s1.customCar();
    }
}