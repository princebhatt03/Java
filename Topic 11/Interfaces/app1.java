interface bicycle {
    void applyBreak(int decrement);

    void speedUp(int increament);
}

class avonCylce implements bicycle {
    int speed = 7;

    public void applyBreak(int decrement) {
        speed = speed - decrement;
    }

    public void speedUp(int increament) {
        speed = speed + increament;
    }
}

public class app1 {
    public static void main(String[] args) {
        // Interfaces is point where two system meet and interact...
        // Interfaces in Java is a group of related methods with empty bodies...
        System.out.println("Interfaces");

    }
}