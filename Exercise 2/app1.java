import java.util.Random;
import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        System.out.println("Exercise 2");
        System.out.println("Rock Paper Scissor Game");
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt(3);
        if (userInput == computerInput) {
            System.out.println("Game Draw");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("You Win");
        } else {
            System.out.println("Computer Win, you Lose");
        }
        if (computerInput == 0) {
            System.out.println("Computer Choosed Rock");
        } else if (computerInput == 1) {
            System.out.println("Computer Choosed Paper");
        } else if (computerInput == 2) {
            System.out.println("Computer Choosed Scissor");
        }
    }
}