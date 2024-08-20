import java.util.Scanner;

public class app3 {
    static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial using Recursion Method");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("The Factorial of " + n + " is " + factorial(n));
    }
}