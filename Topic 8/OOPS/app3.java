class studentDetails {
    String name;
    int studentID;
    int age;

    public void printDetails() {
        System.out.println("Student's name is: " + name);
        System.out.println("Student's ID is: " + studentID);
        System.out.println("Student's age is: " + age);
    }
}

public class app3 {
    public static void main(String[] args) {
        studentDetails student1 = new studentDetails();
        studentDetails student2 = new studentDetails();
        student1.name = "Prince Bhatt";
        student1.studentID = 31711;
        student1.age = 22;
        student2.name = "Vanshika Nema";
        student2.studentID = 31733;
        student2.age = 22;
        student1.printDetails();
        student2.printDetails();
    }
}
