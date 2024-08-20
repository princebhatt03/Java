public class app6 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 5");
        int i = 1;
        int num = 10;
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;
        System.out.println("The Fibonaccii Series till " + num + " is :");
        while (i <= num) {
            System.out.print(firstTerm + ", ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        }
    }
}