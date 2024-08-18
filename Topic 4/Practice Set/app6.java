import java.util.Scanner;

public class app6 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 6");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Website Name:");
        String website = sc.nextLine();
        if (website.endsWith(".com")) {
            System.out.println(website + " is a Commercial Website");
        } else if (website.endsWith(".org")) {
            System.out.println(website + " is a Organisation Website");
        } else if (website.endsWith(".in")) {
            System.out.println(website + " is an Indian website");
        } else {
            System.out.println("Enter the Valid Website Name");
        }
    }
}
