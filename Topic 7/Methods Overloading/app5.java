public class app5 {
    static void func1() {
        System.out.println("Hello");
    }

    static void func1(String a) { // In this case a is the Parameter...
        System.out.println("Hello " + a);
    }

    static void func1(int a) {
        System.out.println("Hello " + a);
    }

    public static void main(String[] args) {
        System.out.println("Method Overloading");
        func1();
        func1(12);
        func1("Vanshi"); // In this case the value of a is the Argument...
    }
}

// Note: We cannot perform Method Overloading by changing the Return type of the
// Methods...