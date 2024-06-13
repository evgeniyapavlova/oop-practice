package practice5.example.view;

import java.util.List;
import java.util.Scanner;

import practice5.example.controller.StudentController;
import practice5.example.model.Student;

public class StudentView {
    private StudentController controller = new StudentController();

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Create a student");
            System.out.println("2 - Find a student by id");
            System.out.println("3 - Print all students info");
            System.out.println("4 - Return to the main menu");

            switch (scanner.nextInt()) {
                case 1 -> createStudent();
                case 2 -> getById();
                case 3 -> getAllStudents();
                case 4 -> {
                    System.out.println("Returning to main menu...");
                    return;
                }
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

        Student student = controller.createStudent(name, lastName);

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
