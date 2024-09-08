class rectangle {
    int length;
    int breadth;

    public int area() {
        return length * breadth;
    }

    public int parameter() {
        return 2 * (length + breadth);
    }
}

public class app4 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 4");
        rectangle rc = new rectangle();
        rc.length = 20;
        rc.breadth = 12;
        System.out.println(rc.area());
        System.out.println(rc.parameter());
    }
}
