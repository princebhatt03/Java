public class app3 {
    public static void main(String[] args) {
        System.out.println("If Else-if Ladder");
        int age = 76;
        // This is Wrong Way of Writting two Conditions 
        if (age >= 18) {
            System.out.println("You Can Drive");
        } else if (age < 60) {
            System.out.println("You are too Old, you cannot drive");
        } else if (age < 18) {
            System.out.println("You  are too young, you cannot drive");
        } else {
            System.out.println("Enter Valid Age");
        }
    }
}
