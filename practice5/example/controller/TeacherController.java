package practice5.example.controller;

import java.util.List;

import practice5.example.model.Teacher;
import practice5.example.service.TeacherService;

public class TeacherController {
    TeacherService teacherService = new TeacherService();

    public Teacher createTeacher(String name, String lastName) {
        return teacherService.createTeacher(name, lastName);
    }

    public Teacher getById(int id) {
        return teacherService.getById(id);
    }

    public List<Teacher> getAlltTeachers() {
        return teacherService.getAllTeachers();
    }
}
