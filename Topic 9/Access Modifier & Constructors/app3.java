class myEmployeee {
    private int id;
    private String name;

    public myEmployeee() {
        id = 31733;
        name = "Prince Bhatt";
    }

    public void setId(int i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    public int getId() {
        System.out.println("ID: " + id);
        return id;
    }

    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }
}

public class app3 {
    public static void main(String[] args) {
        System.out.println("Constructors");
        myEmployeee employee1 = new myEmployeee();
        // employee1.setName("Prince Bhatt");
        // employee1.setId(31711);
        employee1.getName();
        employee1.getId();
    }
}