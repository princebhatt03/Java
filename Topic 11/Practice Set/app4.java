abstract class telephone {
    abstract public void ring();

    abstract public void lift();

    abstract public void disconnected();
}

class smartTelephone extends telephone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void lift() {
        System.out.println("Lifted...");
    }

    public void disconnected() {
        System.out.println("Disconnected...");
    }
}

public class app4 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 4");
        smartTelephone s1 = new smartTelephone();
        s1.ring();
        s1.lift();
        s1.disconnected();
    }
}
