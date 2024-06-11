package practice4.service;

import practice4.model.Teacher;

public class TeacherService {
    public Teacher createTeacher(int id, String name, String lastName) {
        return new Teacher(id, name, lastName);
    }
}
