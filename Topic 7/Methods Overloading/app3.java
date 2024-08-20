public class app3 {
    static void change(int a) {
        a = 99;
    }

    static void change2(int[] arr) {
        arr[0] = 99;
    }

    public static void main(String[] args) {
        // for an integer
        int x = 45;
        change(x);
        System.out.println(x);
        System.out.println("Changing Array using Methods");
        // for an Array...
        int[] arr = { 12, 23, 21, 2332 };
        change2(arr);
        System.out.println(arr[0]);
        // because it provides reference of an array...
    }
}
