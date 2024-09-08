class cellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling Friend...");
    }
}

public class app2 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 2");
        cellPhone asus = new cellPhone();
        asus.callFriend();
        asus.ring();
        asus.vibrate();
    }
}
