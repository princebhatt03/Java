import java.util.Scanner;

public class app1 {
    static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice Set Question 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        table(num);
    }
}