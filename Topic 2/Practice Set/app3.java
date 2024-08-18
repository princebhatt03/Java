import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        System.out.println("Practice Set 2 Question 3");
        int num = 12;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int userNumber = sc.nextInt();
        System.out.println(userNumber < num);
    }
}
