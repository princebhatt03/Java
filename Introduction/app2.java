import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        System.out.println("Practice");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = (a + b);
        int sub = (a - b);
        int mul = (a * b);
        float div = (a / b);
        System.out.println("The sum of the Given Numbers is :" + sum);
        System.out.println("The sub of the Given Numbers is :" + sub);
        System.out.println("The mul of the Given Numbers is :" + mul);
        System.out.println("The div of the Given Numbers is :" + div);
    }
}
