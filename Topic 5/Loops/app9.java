public class app9 {
    public static void main(String[] args) {
        System.out.println("Continue");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("Done");
                continue;
            }
        }
    }
}
