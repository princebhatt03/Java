// Recursion is a Function that is call itself, Such calling of a function ny
// itself is called Recurion...

import java.util.Scanner;

public class app1 {
    static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Recursion");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("The Factorial of " + n + " is " + factorial(n));
    }
}