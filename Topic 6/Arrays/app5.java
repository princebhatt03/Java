public class app5 {
    public static void main(String[] args) {
        System.out.println("Decrement For Loop in Array");
        int[] marks = { 98, 23, 46, 47, 94 };
        for (int i = marks.length - 1; i >= 0; --i) {
            System.out.println(marks[i]);
        }
    }
}
