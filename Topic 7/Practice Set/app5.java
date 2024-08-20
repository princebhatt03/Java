public class app5 {
    static void stars(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice Set Question 4");
        stars(10);
    }
}
