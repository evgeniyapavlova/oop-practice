package practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        StudentGroup stGroup = new StudentGroup();

        Student student1 = new Student("Anna", 10);
        Student student2 = new Student("Kate", 2);
        Student student3 = new Student("Alexander", 3);
        Student student4 = new Student("Dmitry", 4);

        stGroup.addStudent(student1);
        stGroup.addStudent(student2);
        stGroup.addStudent(student3);
        stGroup.addStudent(student4);

        // Iterator<Student> iterator = new StudentGroupIterator(stGroup);

        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }

        // for (Student student : stGroup) {
        // System.out.println(student);
        // }

        ArrayList<Student> arrayList = new ArrayList<>(List.of(student1, student2,
                student3, student4));

        System.out.println(arrayList);

        // public int compare(Student o1, Student o2) {
        // return o1.id - o2.id;
        // }

        Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id);
        // Collections.sort(arrayList, new StudentComparator());
        // Collections.sort(arrayList, Comparator.reverseOrder());

        System.out.println(arrayList);

        // Stream stream1 = new Stream(List.of(stGroup));

        // System.out.println(stream1);
    }
}
