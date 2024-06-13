package practice5.example.service;

import java.util.List;

import practice5.example.model.Student;
import practice5.example.model.DB.DataBase;

public class StudentService {
    public Student createStudent(String name, String lastName) {

        Student student = new Student(name, lastName);
        DataBase.addStudent(student);

        return student;
    }

    public Student getById(int id) throws Exception {
        Student student = DataBase.getStudentsDB() // list of students
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
        return DataBase.getStudentsDB();
    }
}
