import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Maths Marks :");
        int sub1 = sc.nextInt();
        System.out.println("Enter Your Physics Marks :");
        int sub2 = sc.nextInt();
        System.out.println("Enter Your Chemistry Marks :");
        int sub3 = sc.nextInt();
        int totalMarks = sub1 + sub2 + sub3;
        System.out.println("Total Marks : " + totalMarks);
        float totalPercent = totalMarks * 100 / 300;
        System.out.println("Total Percentage : " + totalPercent);
        if (totalPercent >= 90 && totalPercent <= 100) {
            System.out.println("Excellent");
        } else if (totalPercent >= 80 && totalPercent < 90) {
            System.out.println("Very Good");
        } else if (totalPercent >= 70 && totalPercent < 80) {
            System.out.println("Good");
        } else if (totalPercent >= 60 && totalPercent < 70) {
            System.out.println("Average");
        } else if (totalPercent >= 45 && totalPercent < 60) {
            System.out.println("Do Hard Work");
        } else if (totalPercent >= 33 && totalPercent < 45) {
            System.out.println("Pass With Grace");
        } else if (totalPercent < 33) {
            System.out.println("Fail");
        } else {
            System.out.println("Enter Valid Marks");
        }
    }
}
