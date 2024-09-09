class employee {
    int id;
    String name;

    public employee(int myId, String myname) {
        id = myId;
        name = myname;
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

public class app4 {
    public static void main(String[] args) {
        System.out.println("Constructor With Arguments");
        employee employee1 = new employee(31711, "Prince Bhatt");
        employee1.getId();
        employee1.getName();
    }
}
