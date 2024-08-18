public class app4 {
    public static void main(String[] args) {
        System.out.println("Ptractice Set Question 3");
        int[] marks = { 98, 76, 54, 12, 57 };
        int sum = 0;
        for (int elem : marks) {
            sum += elem;
        }
        System.out.println("The Sum of marks of all student is: " + sum / marks.length);
    }
}
