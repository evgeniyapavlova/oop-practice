package practice5.example.service;

import java.util.List;

import practice5.example.model.Student;
import practice5.example.model.DB.DataBase;

public class StudentService {
    public Student createStudent(String name, String lastName, int groupId) {
        int id;

        int size = DataBase.studentsDB.size();
        // id = size + 1
        if (size == 0)
            id = 1;
        else
            id = size + 1;

        Student student = new Student(id, name, lastName, groupId);
        DataBase.studentsDB.add(student);

        return student;
    }

    public Student getById(int id) throws Exception {
        Student student = DataBase.studentsDB // list of students
                .stream() // stream for calculating, analogue of 'for' loop
                .filter(s -> s.getId() == id) // filter by condition
                .findFirst() // return first occurence
                .orElse(null); // if nothing found, return null, orElse - terminal method, will close the
                               // stream

        if (student == null) {
            throw new Exception("Student not found");
        } else
            return student;
    }

    public List<Student> getAllStudents() {
        return DataBase.studentsDB;
    }
}
