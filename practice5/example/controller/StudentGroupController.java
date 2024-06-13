package practice5.example.controller;

import java.util.List;

import practice5.example.model.Student;
import practice5.example.model.StudentGroup;
import practice5.example.model.Teacher;
import practice5.example.service.StudentGroupService;

public class StudentGroupController {
    StudentGroupService studentGroupService = new StudentGroupService();

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return studentGroupService.createStudentGroup(teacher, students);
    }

    public StudentGroup getById(int id) {
        StudentGroup studentGroup = null;
        try {
            studentGroup = studentGroupService.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return studentGroup;
    }

    public List<StudentGroup> getAllStudentGroups() {
        return studentGroupService.getAllStudentGroups();
    }

    public List<Student> getAllStudentsFromGroup(int groupId) {
        return studentGroupService.getAllStudentsFromGroup(groupId);
    }

    public Teacher getGroupTeacher(int groupId) {
        return studentGroupService.getGroupTeacher(groupId);
    }
}
