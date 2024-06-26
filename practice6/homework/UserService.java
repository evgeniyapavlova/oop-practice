package homework;

public class UserService {
    private User user;

    public UserService(User user) {
        this.user = user;
    }

    public void save() {
        Saving saving = new Saving(user);
        saving.save();
    }

    public void report() {
        Report report = new Report(user);
        report.report();
    }
}
