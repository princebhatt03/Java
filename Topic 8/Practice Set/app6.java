class circle {
    float pie = 3.14f;

    public float area(int radius) {
        return (pie) * radius * radius;
    }

    public float parameter(int radius) {
        return 2 * pie * radius;
    }
}

public class app6 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 6");
        circle c = new circle();
        System.out.println(c.area(4));
        System.out.println(c.parameter(4));
    }
}
