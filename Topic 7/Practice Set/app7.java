public class app7 {
    static int func(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return func(n - 1) + func(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice Set Question 5 using Recursion");
        int result = func(7);
        System.out.println(result);
    }
}
