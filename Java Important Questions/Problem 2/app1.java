// Q2. WAP for wheater a given Number is Prime or Not?

import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        System.out.println("Problem 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num/2; i++) {
            if (num % 2 == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}