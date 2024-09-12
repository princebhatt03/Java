class firstClass {
    public void greet() {
        System.out.println("Hello");
    }

    public void name() {
        System.out.println("My Name is Java");
    }
}

class secondClass extends firstClass {
    public void greet2() {
        System.out.println("Hola");
    }

    @Override
    public void name() {
        System.out.println("My Name is Java in 2nd Class");
    }
}

public class app2 {
    public static void main(String[] args) {
        System.out.println("Dynamic Method Dispatch in Java");
        // firstClass a = new firstClass();
        // firstClass a = new secondClass(); : Allowed
        // secondClass b = new firstClass(); : Not Allowed
        firstClass a = new secondClass();
        a.name();
        // It will give the child class's Method because it the object is secondClass...
        // The reference is parent's class but it is depend on Object not refernce...
        // It is also Know as the runtime Polymorphism...
    }
}
