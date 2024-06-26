package homework;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");

        UserService userService = new UserService(user);

        userService.report();
        userService.save();
    }
}