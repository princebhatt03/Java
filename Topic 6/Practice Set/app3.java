import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 3");
        Scanner sc = new Scanner(System.in);
        int[] arr = { 3, 16, 32, 79, 90 };
        boolean isInArray = false;
        System.out.println("Enter the Value you want to See in the Array: ");
        int num = sc.nextInt();
        for (int elem : arr) {
            if (num == elem) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value " + num + " is present in the Array");
        } else {
            System.out.println("The Value " + num + " is not present in the Array");
        }
    }
}
