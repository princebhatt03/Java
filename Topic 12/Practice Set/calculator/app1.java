package calculator;

class Calculator {
    public void meth1() {
        System.out.println("I am Calculator");
    }
}

class scCalculator {
    public void meth2() {
        System.out.println("I am Scientific Calculator");
    }
}

class hybirdCalculator {
    public void meth3() {
        System.out.println("I am Hybrid Calculator");
    }
}

public class app1 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 1");
        Calculator c1 = new Calculator();
        scCalculator c2 = new scCalculator();
        hybirdCalculator c3 = new hybirdCalculator();
        c1.meth1();
        c2.meth2();
        c3.meth3();
    }
}