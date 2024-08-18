public class app1 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 1");
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}