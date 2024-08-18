// Q1. WAP for wheather a entered year is a Leap year or not? 

import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        System.out.println("Leap year or Not");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}