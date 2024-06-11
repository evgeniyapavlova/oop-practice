package practice4.controller;

import java.util.List;
import practice4.model.Teacher;
import practice4.model.User;
import practice4.view.TeacherView;
import practice4.view.UserView;

public class TeacherController implements UserController {

    private UserView<Teacher> view = new TeacherView();

    @Override
    public <T extends User> User create(T user) {
        return (User) user;
    }

    @Override
    public <T extends User> void edit(T user, String name, String lastName) {
        user.setLastName(lastName);
        user.setName(name);
    }

    public void sendOnConsole(List<Teacher> students) {
        view.sendOnConsole(students);
    }

    @Override
    public <T extends User> void printList(List<T> users) {
        System.out.println(users);
    }

}
