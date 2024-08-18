import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        System.out.println("Array");
        int arr[] = { 12, 223, 42, 4, 32, 342 };
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isInArray = false;
        for (int elem : arr) {
            if (num == elem) {
                isInArray = true;
            }
        }
        if (isInArray) {
            System.out.println("The value " + num + " is present in the Array");
        } else {
            System.out.println("The value " + num + " is not present in the Array");
        }
    }
}
