public class app4 {
    static void met1() {
        System.out.println("Good Morning");
    }

    static void met1(int a) {
        System.out.println("Good Night " + a);
    }

    public static void main(String[] args) {
        // Two or more methods having same name but different parameters is Method
        // overloading...
        System.out.println("Method Overloading");
        met1(3000);
    }
}
