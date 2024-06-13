package practice5.example.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    List<Integer> groups = new ArrayList<>();

    public Teacher(String name, String lastName) {
        super(name, lastName);
    }

    public void addGroupId(int id) {
        groups.add(id);
    }
}
