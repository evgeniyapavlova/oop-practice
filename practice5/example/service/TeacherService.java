package practice5.example.service;

import java.util.List;

import practice5.example.model.Teacher;
import practice5.example.model.DB.DataBase;

public class TeacherService {

    public Teacher createTeacher(String name, String lastName) {

        Teacher teacher = new Teacher(name, lastName);
        DataBase.addTeacher(teacher);

        return teacher;
    }

    public Teacher getById(int id) {
        Teacher teacher = null;
        try {
            teacher = DataBase.getTeachersDB()
                    .stream()
                    .filter(t -> t.getId() == id)
                    .findFirst()
                    .orElse(null);

        } catch (Exception e) {
            System.out.println("Teacher not found");
        }

        return teacher;
    }

    public List<Teacher> getAllTeachers() {
        return DataBase.getTeachersDB();
    }
}
