public class app8 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 7");
        int[] arr = { 1, 2, 23, 423, 53, 556 };
        int min = Integer.MAX_VALUE;
        for (int elem : arr) {
            if (elem < min) {
                min = elem;
            }
        }
        System.out.println(min);
    }
}
