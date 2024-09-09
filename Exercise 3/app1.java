import java.util.Random;
import java.util.Scanner;

class game {
    public int num;
    public int inpNum;
    public int guess = 0;

    game() {
        Random ran = new Random();
        this.num = ran.nextInt(100);
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int noGuess) {
        this.guess = noGuess;
    }

    void userInput() {
        System.out.println("Guess the Number");
        Scanner sc = new Scanner(System.in);
        inpNum = sc.nextInt();
    }

    boolean isCorrect() {
        guess++;
        if (inpNum == num) {
            System.out.println("Yess Your Guess is correct, you made it in " + guess + " Attempts");
            return true;
        } else if (inpNum < num) {
            System.out.println("Your guess is less than number");
        } else if (inpNum > num) {
            System.out.println("Your guess is greator than number");
        }
        return false;
    }
}

public class app1 {
    public static void main(String[] args) {
        System.out.println("Exercise 3");
        System.out.println("Guess the Number Game");
        game g = new game();
        boolean b = false;
        while (!b) {
            g.userInput();
            b = g.isCorrect();
            System.out.println(b);
        }
    }
}