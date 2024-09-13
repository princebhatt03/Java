interface tvRemote {
    void click();
}

interface smartTVRemote extends tvRemote {
    void smartClick();
}

class tv implements smartTVRemote {
    public void click() {
        System.out.println("Clicking...");
    }

    public void smartClick() {
        System.out.println("Smart...");
    }
}

public class app6 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 6 and Question 7");
        tv t = new tv();
        t.click();
        t.smartClick();
    }
}
