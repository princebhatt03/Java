import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        System.out.println("Practice Question 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("The Factorial of the given number is : " + fact);
    }
}