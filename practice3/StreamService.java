package practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    List<StudentGroup> sgList = new ArrayList<>();

    public StreamService(List<StudentGroup> sgList) {
        this.sgList = sgList;
    }

    public void sort() {
        Collections.sort(sgList, new StreamComparator());
    }
}
