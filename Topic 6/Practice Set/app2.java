public class app2 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 1, B");
        float[] flats = { 12.5f, 10.4f, 78.9f, 34.6f, 98.3f };
        float sum = 0;
        for (float elem : flats) {
            sum += elem;
        }
        System.out.println(sum);
    }
}
