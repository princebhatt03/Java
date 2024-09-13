interface bicycle2 {
    void applyBreak(int decrement);

    void speedUp(int increament);
}

class cycle {
    public void blowHorn() {
        System.out.println("Horn");
    }
}

class avonCylce2 extends cycle implements bicycle2 {
    int speed = 50; // By Default it is Final...

    public void applyBreak(int decrement) {
        System.out.println("Apply Break");
        speed = speed - decrement;
    }

    public void speedUp(int increament) {
        System.out.println("Apply Speed");
        speed = speed + increament;
    }
}

public class app2 {
    public static void main(String[] args) {
        System.out.println("Abstract vs Interface");
        avonCylce2 a1 = new avonCylce2();
        a1.applyBreak(45);
        System.out.println(a1.speed);
        a1.blowHorn();
    }
}
