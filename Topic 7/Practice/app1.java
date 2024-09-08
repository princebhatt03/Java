public class app1 {
    public static void multiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }

    public static void main(String[] args) {
        multiplicationTable(5);
    }
}