package practice5.example.model.DB;

import java.util.ArrayList;
import java.util.List;

import practice5.example.model.Student;
import practice5.example.model.StudentGroup;
import practice5.example.model.Teacher;

public class DataBase {
    private static final List<Student> studentsDB = new ArrayList<>();
    private static final List<Teacher> teachersDB = new ArrayList<>();
    private static final List<StudentGroup> studentGroupsDB = new ArrayList<>();

    public static void fillDB() {
        Teacher teacher = new Teacher("Ivan", "Ivanov");

        addTeacher(teacher);

        Student s1 = new Student("Alex", "Osipov");
        Student s2 = new Student("Oleg", "Vasiliev");

        addStudent(s1);
        addStudent(s2);

    }

    public static List<Student> getStudentsDB() {
        return studentsDB;
    }

    public static List<Teacher> getTeachersDB() {
        return teachersDB;
    }

    public static List<StudentGroup> getStudentGroupsDB() {
        return studentGroupsDB;
    }

    public static void addStudent(Student student) {
        student.setId(studentsDB.size() + 1);
        studentsDB.add(student);
    }

    public static void addTeacher(Teacher teacher) {
        teacher.setId(teachersDB.size() + 1);
        teachersDB.add(teacher);
    }

    public static void addStudentGroup(StudentGroup studentGroup) {
        studentGroup.setId(studentGroupsDB.size() + 1);
        studentGroupsDB.add(studentGroup);
    }
}
