package practice5.example.view;

import java.util.List;
import java.util.Scanner;

import practice5.example.controller.TeacherController;
import practice5.example.model.Teacher;

public class TeacherView {
    private TeacherController controller = new TeacherController();

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Create a teacher");
            System.out.println("2 - Find a teacher by id");
            System.out.println("3 - Print all teachers info");
            System.out.println("4 - Return to the main menu");

            switch (scanner.nextInt()) {
                case 1 -> createTeacher();
                case 2 -> getById();
                case 3 -> getAllTeachers();
                case 4 -> {
                    System.out.println("Returning to main menu...");
                    return;
                }
                default -> System.out.println("Operation is not supported");
            }
        }

    }

    private Teacher createTeacher() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input name:");
        String name = scanner.nextLine();

        System.out.println("Input last name:");
        String lastName = scanner.nextLine();

        Teacher teacher = controller.createTeacher(name, lastName);

        System.out.println(teacher);

        return teacher;
    }

    private Teacher getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input id to find teacher:");
        int id = scanner.nextInt();
        Teacher teacher = controller.getById(id);
        System.out.println(teacher);
        return teacher;
    }

    private List<Teacher> getAllTeachers() {
        List<Teacher> teachers = controller.getAlltTeachers();
        System.out.println(teachers);
        return teachers;
    }
}
