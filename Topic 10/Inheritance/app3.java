class animal {
    boolean isAnimal;

    public void setVal(boolean isAnimalVal) {
        isAnimal = isAnimalVal;
    }

    public boolean getVal() {
        System.out.println(isAnimal);
        return isAnimal;
    }
}

class dog extends animal {
    boolean dog;
    boolean isAnimal;

    public void set(boolean isAnimal) {
        dog = isAnimal;
    }

    public boolean get() {
        System.out.println("Dog: " + isAnimal);
        return isAnimal;
    }
}

public class app3 {
    public static void main(String[] args) {
        System.out.println("Quick Quiz");
        dog d1 = new dog();
        d1.setVal(true);
        d1.getVal();
    }
}
