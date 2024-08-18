public class app1 {
    public static void main(String[] args) {
        System.out.println("Array");
        float[] arr = { 12.3f, 134.5f, 234.3f, 4.6f, 8.9f };
        float sum = 0;
        for (float elem : arr) {
            sum += elem;
        }
        System.out.println(sum);
    }
}