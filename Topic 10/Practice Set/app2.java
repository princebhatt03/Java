class rectangle {
    int length;
    int breadth;

    rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Rectangle");
    }

    public int area() {
        return length * breadth;
    }
}

class cuboid extends rectangle {
    int height;

    cuboid(int length, int breadth, int height) {
        super(length, breadth);
        System.out.println("Cuboid");
        this.height = height;
    }

    public int area() {
        return 2 * (length * breadth + breadth * height + length * height);
    }
}

public class app2 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 2");
        // rectangle a1 = new rectangle(20, 30);
        cuboid a2 = new cuboid(20, 30, 40);
    }
}
