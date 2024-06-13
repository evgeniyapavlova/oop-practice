package practice5.example.model;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> students;
    private int id;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentGroup [teacher=" + teacher + ", students=" + students + ", id=" + id + "]";
    }

}
