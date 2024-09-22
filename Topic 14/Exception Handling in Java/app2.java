public class app2 {
    public static void main(String[] args) {
        System.out.println("Try-Catch Block in Java");
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("The res is: " + c);
        } catch (Exception e) {
            System.out.println("Can't Divide these Number");
            System.out.println(e);
        }
        System.out.println("This is Exception Handling...");
    }
}
