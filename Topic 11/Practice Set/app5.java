abstract class Mon {
    abstract public void jumpp();

    abstract public void bitee();
}

class hum extends Mon {
    public void jumpp() {
        System.out.println("Jumping...");
    }

    public void bitee() {
        System.out.println("Biting...");
    }
}

public class app5 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 5");
        hum h1 = new hum();
        h1.bitee();
        h1.jumpp();
    }
}
