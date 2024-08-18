public class app5 {
    public static void main(String[] args) {
        System.out.println("Array");
        int[] arr = { 1, 2, 3, 4, 5 };
        int a = Math.floorDiv(arr.length, 2);
        int l = arr.length;
        int temp;
        for (int i = 0; i < a; i++) {
            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }
        for (int elem : arr) {
            System.out.println(elem + " ");
        }
    }
}
