package practice3;

import java.util.Iterator;
import java.util.List;

public class Stream extends StreamService implements Iterable<StudentGroup> {
    private int index = 0;

    public Stream(List<StudentGroup> sgList) {
        super(sgList);
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
        return sgList.toString();
    }
}
