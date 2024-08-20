import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        System.out.println("Factorial using Itrative Approach");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("The Factorial of " + num + " is " + factorial);
    }
}
