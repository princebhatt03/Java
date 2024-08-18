import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        System.out.println("Parctice Set Question 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value in Kilometer : ");
        int KM = sc.nextInt();
        double convertor = KM * 0.621371d;
        System.out.println("The Value in Miles : " + convertor);
    }
}
