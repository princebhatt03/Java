import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 3");
        System.out.println("Multiplication Table");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for Table: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + i * num);
        }
    }
}
