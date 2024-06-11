package practice4.controller;

import java.util.List;

import practice4.model.User;

public interface UserController {
    <T extends User> User create(T user);

    <T extends User> void edit(T user, String name, String lastName);

    <T extends User> void printList(List<T> users);

}
