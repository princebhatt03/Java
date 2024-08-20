public class app11 {
    static double con(int num) {
        double constant = 1.8;
        return (num * constant) + 32;
    }

    public static void main(String[] args) {
        System.out.println("Practice Set Question 11");
        double temp = con(8);
        System.out.println(temp);
    }
}
