package practice5.example.model;

public class Student extends User {
    int groupId;

    public Student(String name, String lastName) {
        super(name, lastName);
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

}
