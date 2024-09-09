class stud {
    int id;
    String name;

    public stud(String myName) {
        name = myName;
    }

    public stud(int myId) {
        id = myId;
    }

    public stud() {
        System.out.println("Hello");
    }

    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }

    public int getId() {
        System.out.println("Id: " + id);
        return id;
    }
}

public class app5 {
    public static void main(String[] args) {
        System.out.println("Constructor Overloading");
        stud studentId = new stud(31711);
        stud studentName = new stud("Prince");
        stud greet = new stud();
        studentId.getId();
        studentName.getName();
    }
}
