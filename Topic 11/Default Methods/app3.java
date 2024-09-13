interface camera {
    void cam();
}

interface gps {
    void location();
}

class cellPhone {
    void cp() {
        System.out.println("Normal Phone");
    }
}

class smartPhone extends cellPhone implements camera, gps {
    public void cam() {
        System.out.println("Camera");
    }

    public void location() {
        System.out.println("Location");
    }
}

public class app3 {
    public static void main(String[] args) {
        System.out.println("Polymorphism in Interfaces");
        camera c1 = new smartPhone(); // If we use only camera interface then we can't access other Methods...
        smartPhone s1 = new smartPhone(); // we have to use smartPhone Obj for using all function
        // c1.location(); : Not Allowed...
        c1.cam();
        s1.cp();
        s1.location();
        s1.cam();
    }
}
