public class app5 {
    public static int fab(int num) {
        if (num == 1 || num == 2) {
            return num - 1;
        } else {
            return fab(num - 1) + fab(num - 2);
        }
    }

    public static void main(String[] args) {
        int res = fab(5);
        System.out.println(res);
    }
}
