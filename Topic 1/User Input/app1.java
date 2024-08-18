import java.util.Scanner;

public class app1 {

    public static void main(String[] args) {
        System.out.println("User Input");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        byte b = sc.nextByte();
        short c = sc.nextShort();
        boolean d = sc.nextBoolean();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}