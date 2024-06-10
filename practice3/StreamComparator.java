package practice3;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup g1, StudentGroup g2) {

        String[] names1 = g1.students.toString().split(" ");
        String[] names2 = g2.students.toString().split(" ");

        return names1.length - names2.length;
    }

}
