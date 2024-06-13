package practice5.example.view;

import java.util.List;
import java.util.Scanner;

import practice5.example.controller.StudentController;
import practice5.example.model.Student;
import practice5.example.model.DB.DataBase;

public class StudentView {
    private StudentController controller = new StudentController();

    public void start() {
        DataBase.fillDB();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Create a student");
            System.out.println("2 - Find a student by id");
            System.out.println("3 - Print all students info");
            System.out.println("4 - Exit");

            switch (scanner.nextInt()) {
                case 1 -> createStudent();
                case 2 -> getById();
                case 3 -> getAllStudents();
                case 4 -> System.exit(0);
                default -> System.out.println("Operation is not supported");
            }
        }

    }

    private Student createStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input name:");
        String name = scanner.nextLine();

        System.out.println("Input last name:");
        String lastName = scanner.nextLine();

        System.out.println("Input Group ID:");
        int groupId = scanner.nextInt();
        Student student = controller.createStudent(name, lastName, groupId);
        System.out.println(student);
        return student;
    }

    private Student getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input id to find student:");
        int id = scanner.nextInt();
        Student student = controller.getById(id);
        System.out.println(student);
        return student;
    }

    private List<Student> getAllStudents() {
        List<Student> students = controller.getAllStudents();
        System.out.println(students);
        return students;
    }
}
