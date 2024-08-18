public class app1 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 1");
        int[] flats = new int[5];
        flats[0] = 100;
        flats[1] = 101;
        flats[2] = 102;
        flats[3] = 103;
        flats[4] = 104;
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i];
            System.out.println(sum);
        }
    }
}