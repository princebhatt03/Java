class emp {
    int id;
    String name;
    int salary;

    public emp(int intiSalary) {
        salary = intiSalary;
    }

    public int getId() {
        System.out.println("Id: " + id);
        return id;
    }

    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }

    public int getSalary() {
        System.out.println("Salary: " + salary);
        return salary;
    }
}

public class app6 {
    public static void main(String[] args) {
        System.out.println("Quick Quiz");
        emp employee1 = new emp(2000000);
        employee1.getSalary();
    }
}
