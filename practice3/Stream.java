package practice3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private int index = 0;
    List<StudentGroup> sgList = new ArrayList<>();

    public Stream(List<StudentGroup> sgList) {
        this.sgList = sgList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            @Override
            public boolean hasNext() {
                return index < sgList.size();
            }

            @Override
            public StudentGroup next() {
                return sgList.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        return String.format("Amount of groups: %d | %s", sgList.size(), sgList.toString());
    }
}
