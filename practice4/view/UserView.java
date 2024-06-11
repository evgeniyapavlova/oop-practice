package practice4.view;

import java.util.List;

import practice4.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> users);
}
