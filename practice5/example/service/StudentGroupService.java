package practice5.example.service;

import java.util.List;

import practice5.example.model.Teacher;
import practice5.example.model.Student;
import practice5.example.model.StudentGroup;
import practice5.example.model.DB.DataBase;

public class StudentGroupService {
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        StudentGroup studentGroup = new StudentGroup(teacher, students);
        DataBase.addStudentGroup(studentGroup);

        return studentGroup;
    }

    public List<StudentGroup> getAllStudentGroups() {
        return DataBase.getStudentGroupsDB();
    }

    public StudentGroup getById(int id) {
        StudentGroup studentGroup = null;
        try {
            studentGroup = DataBase.getStudentGroupsDB()
                    .stream()
                    .filter(sg -> sg.getId() == id)
                    .findFirst()
                    .orElse(null);
        } catch (Exception e) {
            System.out.println("Student group not found");
        }

        return studentGroup;
    }

    public List<Student> getAllStudentsFromGroup(int groupId) {
        StudentGroup studentGroup = getById(groupId);
        return studentGroup.getStudents();
    }

    public Teacher getGroupTeacher(int groupId) {
        StudentGroup studentGroup = getById(groupId);
        return studentGroup.getTeacher();
    }
}
