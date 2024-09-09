class myEmployee {
    private int id;
    private String name;

    public void setId(int i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class app1 {
    public static void main(String[] args) {
        System.out.println("Access Modifier");
        myEmployee employee1 = new myEmployee();
        // employee1.id = 31711;
        // employee1.name = "Prince Bhatt";
        // We can't Access Private Variables like this for this we use Getter and
        // Setter...
        // Throws an Error due to Private Access Modifier...
        employee1.setName("Prince Bhatt");
        System.out.println(employee1.getName());
        employee1.setId(31711);
        System.out.println(employee1.getId());
    }
}