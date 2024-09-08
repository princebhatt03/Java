import java.util.Scanner;

class TommyViceCity {
    public void hit() {
        System.out.println("Hitting...");
    }

    public void run() {
        System.out.println("Running...");
    }

    public void fire() {
        System.out.println("Firing...");
    }
}

public class app5 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 5");
        Scanner sc = new Scanner(System.in);
        TommyViceCity vc = new TommyViceCity();
        int userInput = sc.nextInt();
        if (userInput == 1) {
            vc.run();
        } else if (userInput == 2) {
            vc.hit();
        } else if (userInput == 3) {
            vc.fire();
        }
    }
}
