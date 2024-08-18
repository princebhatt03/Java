public class qpp8 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 6");
        int num = 5;
        int i = 1;
        int fact = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("The Factorial of " + num + " is " + fact);
    }
}
