public class app8 {
    static double avg(int... n) {
        double sum = 0.0;
        for (int i : n) {
            sum += i;
        }
        return sum / n.length;
    }

    public static void main(String[] args) {
        System.out.println("Practice Set Question 7");
        double avg = avg(1, 2, 3, 4, 5);
        System.out.println(avg);
    }
}