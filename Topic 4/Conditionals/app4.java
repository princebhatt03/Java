import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        System.out.println("Driving");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        if (age >= 18 && age < 60) {
            System.out.println("You Can Drive");
        } else if (age > 60) {
            System.out.println("You are too old, you cannot Drive");
        } else if (age < 18) {
            System.out.println("You are too young, you cannot Drive");
        }
    }
}
