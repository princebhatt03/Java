interface gps {
    void location();
}

interface camera {
    void cam();
}

interface media {
    void med();
}

class cellPhone {
    void cp() {
        System.out.println("I am Cell Phone");
    }
}

class smartPhone extends cellPhone implements gps, camera, media {
    public void location() {
        System.out.println("Location");
    }

    public void cam() {
        System.out.println("Camera");
    }

    public void med() {
        System.out.println("Media Player");
    }
}

public class app3 {
    public static void main(String[] args) {
        System.out.println("Multiple Interfaces");
        smartPhone vivo = new smartPhone();
        vivo.cam();
        vivo.location();
        vivo.med();
        vivo.cp();
    }
}
