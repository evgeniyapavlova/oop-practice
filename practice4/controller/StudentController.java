package practice4.controller;

import java.util.List;

import practice4.model.Student;
import practice4.model.User;
import practice4.view.StudentView;
import practice4.view.UserView;

public class StudentController implements UserController {

    private UserView<Student> view = new StudentView();

    @Override
    public <T extends User> User create(T user) {
        return (User) user;
    }

    public void sendOnConsole(List<Student> students) {
        view.sendOnConsole(students);
    }

    @Override
    public <T extends User> void edit(T user, String name, String lastName) {
        user.setLastName(lastName);
        user.setName(name);
    }

    @Override
    public <T extends User> void printList(List<T> users) {
        System.out.println(users);        
    }
}
