import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 5");
        System.out.println("Enter the Year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
