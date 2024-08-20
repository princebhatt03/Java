public class app9 {
    static void stars(int n) {
        if (n > 0) {
            stars(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice Set Question 8");
        stars(5);
    }
}
