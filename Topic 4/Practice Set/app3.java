import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income in LPA :");
        int income = sc.nextInt();
        if (income >= 250000 && income < 500000) {
            System.out.println("You have to pay 5% tax from your Income that is : " + income * 5 / 100);
        } else if (income >= 500000 && income < 1000000) {
            System.out.println("You have to pay 20% tax from your Income that is : " + income * 20 / 100);
        } else if (income >= 100000) {
            System.out.println("You have to pay 30% tax from your Income that is : " + income * 30 / 100);
        } else {
            System.out.println("Enter Valid Income in LPA");
        }
    }
}
