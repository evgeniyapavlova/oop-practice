package homework;

public class Saving {
    private final User user;

    public Saving(User user) {
        this.user = user;
    }

    public void save() {
        System.out.println("Save user: " + user.getName());
    }
}
