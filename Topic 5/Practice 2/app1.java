public class app1 {
    public static void main(String[] args) {
        System.out.println("Down Up Triangle Stars Printing");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}