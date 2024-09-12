class circle {
    int radius;

    circle(int radius) {
        System.out.println("I am a Circle");
        this.radius = radius;
    }

    double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class cylinder extends circle {

    cylinder(int r, int h) {
        super(r);
        System.out.println("I am Cylinder...");
        this.height = h;
    }

    int height;

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class app1 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 1");
        // circle a1 = new circle(45);
        cylinder a2 = new cylinder(20, 30);
    }
}