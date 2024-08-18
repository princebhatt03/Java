import java.util.Scanner;

public class app5 {

    public static void main(String[] args) {
        System.out.println("Prime or Not");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= a / 2; ++i) {
            if (a % 2 == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(a + " is a Prime Number");
        } else {
            System.out.println(a + " is Not a Prime Number");
        }
    }
}