package practice4;

import java.util.ArrayList;
import java.util.List;

// import practice4.controller.StudentController;
import practice4.controller.TeacherController;
// import practice4.model.Student;
import practice4.model.Teacher;

public class Practice4Main {
    public static void main(String[] args) {
        // new StudentController()
        // .sendOnConsole(List.of(new Student(1, "Sasha", "ivanov"), new Student(1,
        // "Sveta", "ivanov")));

        Teacher t1 = new Teacher(1, "Teacher 1 name", "Teacher 1 lastName");
        Teacher t2 = new Teacher(2, "Teacher 2 name", "Teacher 2 lastName");

        List<Teacher> teachers = new ArrayList<>(List.of(t1, t2));

        TeacherController teacherController1 = new TeacherController();
        teacherController1.printList(teachers);

        teacherController1.edit(t1, "Teacher 1 name EDITED", "Teacher 1 lastName EDITED");
        teacherController1.printList(teachers);
    }

}
