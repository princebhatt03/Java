abstract class shape {
    abstract public int area();
}

class circle extends shape {
    @Override
    public int area() {
        System.out.println("Area of Circle");
        return area();
    }
}

class rectangle extends shape {
    @Override
    public int area() {
        System.out.println("Area of Rectangle");
        return area();
    }
}

class sqaure extends shape {
    @Override
    public int area() {
        System.out.println("Area of Rectangle");
        return area();
    }
}

public class app2 {
    public static void main(String[] args) {
        System.out.println("Abstract Example");
        circle a1 = new circle();
        rectangle a2 = new rectangle();
        sqaure a3 = new sqaure();
    }
}
