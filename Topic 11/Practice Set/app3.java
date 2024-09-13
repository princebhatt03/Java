interface basicAnimal {
    void eat();

    void sleep();
}

class monkey {
    void jump() {
        System.out.println("Jump");
    }

    void bite() {
        System.out.println("Biting");
    }
}

class human extends monkey implements basicAnimal {
    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class app3 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 3");
        human h1 = new human();
        h1.bite();
        h1.sleep();
        h1.eat();
        h1.jump();
    }
}
