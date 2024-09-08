// Creating a Custom Class...
class Employee {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("My Id is: " + id);
        System.out.println("My Name is: " + name);
        System.out.println("My Salary is: " + salary);
    }

    public int getSalary() {
        return salary;
    }
}

public class app2 {
    public static void main(String[] args) {
        System.out.println("Custom Class");
        Employee employee = new Employee(); // Instantiating a new Employee Object
        Employee employee1 = new Employee(); // Instantiating a new Employee Object
        // Setting Attributes or Properties...
        employee.name = "Prince Bhatt";
        employee.id = 31711;
        employee.salary = 2000000;
        employee1.name = "Vanshika Nema";
        employee1.id = 31733;
        employee1.salary = 2000000;
        // Printing the Attributes...
        employee.printDetails();
        employee1.printDetails();
    }
}