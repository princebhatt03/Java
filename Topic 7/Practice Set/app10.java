public class app10 {
    static void stars(int n) {
        if (n > 0) {
            stars(n + 1);
            for (int i = n; i >= 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice Set Question 10");
        stars(5);
    }
}
