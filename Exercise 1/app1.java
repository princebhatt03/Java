import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        System.out.println("Marksheet");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics Marks: ");
        int sub1 = sc.nextInt();
        System.out.println("Enter your Maths Marks: ");
        int sub2 = sc.nextInt();
        System.out.println("Enter your Chemistry Marks: ");
        int sub3 = sc.nextInt();
        System.out.println("Enter your English Marks: ");
        int sub4 = sc.nextInt();
        System.out.println("Enter your Hindi Marks: ");
        int sub5 = sc.nextInt();
        int totalMarks = (sub1 + sub2 + sub3 + sub4 + sub5);
        System.out.println("Total Marks: " + totalMarks);
        float totalPercentage = totalMarks * 100 / 500;
        System.out.println("Total Percentage: " + totalPercentage);
        if (totalPercentage <= 100 && totalPercentage > 90) {
            System.out.println("Excellent");
        } else if (totalPercentage <= 90 && totalPercentage > 80) {
            System.out.println("Very Good");
        } else if (totalPercentage <= 80 && totalPercentage > 70) {
            System.out.println("Good");
        } else if (totalPercentage <= 70 && totalPercentage > 60) {
            System.out.println("Good but improve your Marks");
        } else if (totalPercentage <= 60 && totalPercentage > 45) {
            System.out.println("Average");
        } else if (totalPercentage <= 45 && totalPercentage > 33) {
            System.out.println("Pass with Grace");
        } else if (totalPercentage < 33) {
            System.out.println("Fail");
        } else {
            System.out.println("Enter valid Marks");
        }
    }
}
