class cylinder {
    int radius;
    int hieght;
    float pie = 3.14f;

    public void setRad(int myRad) {
        radius = myRad;
    }

    public void setHieght(int myHieght) {
        hieght = myHieght;
    }

    public int getRad() {
        System.out.println("The Radius of the Cylinder is: " + radius);
        return radius;
    }

    public int getHieght() {
        System.out.println("The Hieght of the Cylinder is: " + hieght);
        return hieght;
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

public class app1 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 1");
        cylinder cy = new cylinder();
        cy.setHieght(20);
        cy.setRad(10);
        cy.getHieght();
        cy.getRad();
        cy.area();
        cy.vol();
    }
}