package practice5.example.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import practice5.example.controller.StudentController;
import practice5.example.controller.StudentGroupController;
import practice5.example.controller.TeacherController;
import practice5.example.model.Student;
import practice5.example.model.StudentGroup;
import practice5.example.model.Teacher;

public class StudentGroupView {
    private StudentGroupController controller = new StudentGroupController();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Create a student group");
        System.out.println("2 - Find a group by id");
        System.out.println("3 - Print all students from the group");
        System.out.println("4 - Print the teacher of the group");
        System.out.println("5 - Return to the main menu");

        switch (scanner.nextInt()) {
            case 1 -> createStudentGroup();
            case 2 -> getById();
            case 3 -> getAllStudentsFromGroup();
            case 4 -> getGroupTeacher();
            case 5 -> {
                System.out.println("Returning to main menu...");
                return;
            }
        }

    }

    private Teacher getGroupTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input group id:");
        int id = scanner.nextInt();
        Teacher teacher = controller.getGroupTeacher(id);
        System.out.println(teacher);
        return teacher;

    }

    private List<Student> getAllStudentsFromGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input group id:");
        int id = scanner.nextInt();
        List<Student> students = controller.getAllStudentsFromGroup(id);
        System.out.println(students);
        return students;
    }

    private StudentGroup getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input id to find group:");
        int id = scanner.nextInt();
        StudentGroup student = controller.getById(id);
        System.out.println(student);
        return student;
    }

    private StudentGroup createStudentGroup() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input amount of students to add: ");

        int amount = scanner.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= amount; i++) {
            System.out.println("Input id of student to add: ");
            int id = scanner.nextInt();

            students.add(new StudentController().getById(id));
        }

        System.out.println("Input id of the teacher to add:");
        int id = scanner.nextInt();

        StudentGroup studentGroup = controller.createStudentGroup(new TeacherController().getById(id), students);

        return studentGroup;
    }
}
