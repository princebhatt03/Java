class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name2) {
        name = name2;
    }
}

public class app1 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 1");
        Employee employee1 = new Employee();
        employee1.setName("Prince Bhatt");
        employee1.salary = 2000000;
        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());
    }
}