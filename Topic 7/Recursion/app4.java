import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;
        System.out.println("The Fibonacci Series till " + num + ":");
        while (firstTerm <= num) {
            System.out.print(firstTerm + ",");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}