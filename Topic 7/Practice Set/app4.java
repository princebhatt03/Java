public class app4 {
    static int sum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sum(num - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice Set Question 3");
        int n = sum(5);
        System.out.println(n);
    }
}
