import java.util.Scanner;

public class app1 {

    public static void main(String[] args) {
        System.out.println("Practice Set Question 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third Number");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("The Sum of entered numbers is : " + sum);
    }
}