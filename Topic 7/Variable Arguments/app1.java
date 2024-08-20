public class app1 {
    // static int sum(int a, int b) {
    // int c = a + b;
    // return c;
    // }
    static int sum(int... arr) {
        // Available as int[] arr...
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    static int sum1(int x, int... arr) {
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Variable Arguments");
        // VarArgs...
        int a = sum(1, 2, 3, 4, 5, 6);
        int a1 = sum();
        int b = sum1(22, 16, 12);
        System.out.println(a);
        System.out.println(a1);
        System.out.println(b);
    }
}