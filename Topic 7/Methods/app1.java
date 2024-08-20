public class app1 {
    static int mySum(int x, int y) {
        int z = x + y;
        return z;
    }

    static int mySub(int x, int y) {
        int z = x - y;
        return z;
    }

    static int myMul(int x, int y) {
        int z = x * y;
        return z;
    }

    static int myDiv(int x, int y) {
        int z = x / y;
        return z;
    }

    public static void main(String[] args) {
        System.out.println("Methods");
        int a = mySum(2, 5);
        int a1 = mySub(2, 5);
        int a2 = myMul(2, 5);
        int a3 = myDiv(2, 5);
        System.out.println("The Sum of given numbers :  " + a);
        System.out.println("The Different of given numbers :  " + a1);
        System.out.println("The Product of given numbers :  " + a2);
        System.out.println("The Divide of given numbers :  " + a3);
    }
}