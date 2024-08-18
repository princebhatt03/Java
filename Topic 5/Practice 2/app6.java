import java.util.Scanner;

public class app6 {
    public static void main(String[] args) {
        System.out.println("Practice Question 6");
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        char play;
        do {
            System.out.println("Enter the Number: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
            System.out.println("Do you want to add more number? y/n");
            play = sc.next().charAt(0);
        } while (play == 'y' || play == 'Y');
        System.out.println("The Sum of Even numbers : " + even);
        System.out.println("The Sum of Odd numbers : " + odd);
    }
}