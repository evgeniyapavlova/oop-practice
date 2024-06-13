package practice5.example.model.DB;

import java.util.ArrayList;
import java.util.List;

import practice5.example.model.Student;
import practice5.example.model.Teacher;

public class DataBase {
    public static final List<Student> studentsDB = new ArrayList<>();
    public static final List<Teacher> teachersDB = new ArrayList<>();

    public static void fillDB() {
        Teacher teacher = new Teacher(1, "Ivan", "Ivanov");

        teacher.addGroupId(1);

        teachersDB.add(teacher);

        Student s1 = new Student(1, "Alex", "Osipov", 1);
        Student s2 = new Student(1, "Oleg", "Vasiliev", 1);

        studentsDB.add(s1);
        studentsDB.add(s2);

    }
}
