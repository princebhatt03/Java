public class app6 {
    public static int avg(int... num) {
        int a = num.length;
        int sum = 0;
        for (int i : num) {
            sum = sum + i;
        }
        return sum / a;
    }

    public static void main(String[] args) {
        int res = avg(1, 2, 3, 4, 5);
        System.out.println(res);
    }
}
