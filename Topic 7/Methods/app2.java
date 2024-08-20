public class app2 {
    int logic(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        // Calling a Method using Object...
        System.out.println("Calling a Method");
        app2 obj = new app2();
        int a = obj.logic(2, 7);
        System.out.println(a);
    }
}
