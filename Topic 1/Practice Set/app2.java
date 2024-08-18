import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Maths marks: ");
        int sub1 = sc.nextInt();
        System.out.println("Enter your Chemistry marks: ");
        int sub2 = sc.nextInt();
        System.out.println("Enter your Physics marks: ");
        int sub3 = sc.nextInt();
        int totalMarks = sub1 + sub2 + sub3;
        System.out.println("Total Marks : " + totalMarks);
        float totalPercent = totalMarks * 100 / 300;
        System.out.println("Total Percentage : " + totalPercent);
        float CGPA = totalPercent / 9.5f;
        System.out.println("Total CGPA : " + CGPA);
    }
}
