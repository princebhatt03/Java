class rectangle {
    int lenght;
    int breadth;

    public rectangle(int myLenght, int myBreadth) {
        lenght = myLenght;
        breadth = myBreadth;
    }

    public int getLen() {
        System.out.println("Lenght: " + lenght);
        return lenght;
    }

    public int getBred() {
        System.out.println("Breadth: " + breadth);
        return breadth;
    }
}

public class app3 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 4");
        rectangle rc = new rectangle(20, 30);
        rc.getBred();
        rc.getLen();
    }
}
