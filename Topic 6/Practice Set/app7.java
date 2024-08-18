public class app7 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 6");
        int[] arr = { 1, 2, 3, 34, 4, 3425, 345 };
        int max = 0;
        for (int elem : arr) {
            if (elem > max) {
                max = elem;
            }
        }
        System.out.println(max);
    }
}