class studentData {
    private int id;
    private String name;

    public void setId(int i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    public int getId() {
        System.out.println("Student ID: " + id);
        return id;
    }

    public String getName() {
        System.out.println("Student name: " + name);
        return name;
    }

}

public class app2 {
    public static void main(String[] args) {
        System.out.println("Private Access Modifier");
        studentData student1 = new studentData();
        student1.setName("Prince Bhatt");
        student1.setId(31711);
        student1.getName();
        student1.getId();
    }
}
