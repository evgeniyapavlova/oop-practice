package practice3;

import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {
    public StringBuilder students = new StringBuilder();

    public void addStudent(Student student) {
        students.append(student).append(" ");
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return "[students=" + students + "]";
    }

}
