public class app7 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 5");
        int num = 5;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("The Factorial of " + num + " is " + fact);
    }
}