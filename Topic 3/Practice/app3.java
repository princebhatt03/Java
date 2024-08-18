import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        String letter = "Dear <|name|>, Thanks a Lot";
        letter = letter.replace("<|name|>", name);
        System.out.println(letter);
    }
}
