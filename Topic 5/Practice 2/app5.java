import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        System.out.println("Practice Question 5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int rev = 0;
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("The Reverse of the " + num + " is " + rev);
    }
}