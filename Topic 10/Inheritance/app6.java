class firstClass {
    int a;

    int getA() {
        System.out.println(a);
        return a;
    }

    // If we have same Variable name for Setter then we have to use this keyword in
    // Java to provide refrence of it...

    firstClass(int a) {
        this.a = a;
    }
    // Since we use int a in setter for setting a, if we don't use this keyword then
    // it will throw error or give null values...

    public int func1() {
        return 1;
    }

}

class secondClass extends firstClass {
    secondClass(int c) {
        super(c);
        System.out.println(c);
    }
}

public class app6 {
    public static void main(String[] args) {
        System.out.println("this and super Keyword in Java");
        firstClass x = new firstClass(5);
        x.getA();
        secondClass y = new secondClass(69);
        y.getA();
    }
}
