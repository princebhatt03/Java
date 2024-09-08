class square {
    int side;

    public int calArea() {
        int area = side * side;
        return area;
    }

    public int callParameter(int area) {
        int parameter = 4 * area;
        return parameter;
    }
}

public class app3 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 3");
        square sq = new square();
        sq.side = 20;
        System.out.println(sq.callParameter(20));
        System.out.println(sq.calArea());
    }
}
