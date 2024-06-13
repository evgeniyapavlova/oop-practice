package practice5.example.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String name, String lastName) {
        super(id, name, lastName);

    }

    public void addGroupId(int id) { // todo убрать в сервис

        groups.add(id);
    }
}
