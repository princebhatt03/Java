class sphere {
    int radius;

    public void setRad(int myRadius) {
        radius = myRadius;
    }

    public int getRad() {
        System.out.println("The Radius of Sphere: " + radius);
        return radius;
    }
}

public class app4 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 5");
        sphere sp = new sphere();
        sp.setRad(30);
        sp.getRad();
    }
}
