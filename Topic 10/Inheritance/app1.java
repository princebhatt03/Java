// Here parent and child are the name of the class...

class parent {
    int x;

    public int getX() {
        System.out.println(x);
        return x;
    }

    public void setX(int xVal) {
        this.x = xVal;
    }
}

class child extends parent {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int yVal) {
        this.y = yVal;
    }
}

public class app1 {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        // We can use the Child class for getting the value of the x...
        // Since we cannot access the child's value from the parent class...
        // Also we cannot access Private variable from Inheritance...
        child p1 = new child();
        p1.setX(4);
        p1.getX();
    }
}