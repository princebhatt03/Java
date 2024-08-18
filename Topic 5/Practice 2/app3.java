import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}
