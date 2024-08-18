public class app3 {
    public static void main(String[] args) {
        System.out.println("Array");
        int[] arr = { 1, 2, 3, 4, 5 };
        int num = 0;
        for (int elem : arr) {
            num += elem;
        }
        System.out.println("The average of marks is: " + num / arr.length);
    }
}
