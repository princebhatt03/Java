class cylinder2 {
    int radius;
    int hieght;
    float pie = 3.14f;

    public cylinder2(int myRadius, int myHieght) {
        radius = myRadius;
        hieght = myHieght;
    }

    public int area() {
        int ar = (int) (2 * pie * radius * (radius + hieght));
        System.out.println("The area of the Cylinder is: " + ar);
        return ar;
    }

    public int vol() {
        int vol = (int) (2 * pie * radius * hieght);
        System.out.println("The Volume of the Cylinder is: " + vol);
        return vol;
    }
}

public class app2 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 3");
        cylinder2 cy = new cylinder2(10, 20);
        cy.area();
        cy.vol();
    }
}
