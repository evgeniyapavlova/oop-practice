package practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWorkMain {
    public static void main(String[] args) {
        StudentGroup stGroup1 = new StudentGroup();
        StudentGroup stGroup2 = new StudentGroup();
        StudentGroup stGroup3 = new StudentGroup();

        // GROUP 1
        Student student1 = new Student("Anna", 10);
        Student student2 = new Student("Kate", 2);
        Student student3 = new Student("Alexander", 3);
        Student student4 = new Student("Dmitry", 4);
        stGroup1.addStudent(student1);
        stGroup1.addStudent(student2);
        stGroup1.addStudent(student3);
        stGroup1.addStudent(student4);

        // GROUP 2
        Student student8 = new Student("John", 10);
        Student student9 = new Student("Semen", 2);
        Student student10 = new Student("Tatyana", 3);
        Student student15 = new Student("John", 10);
        Student student11 = new Student("Semen", 2);
        Student student12 = new Student("Tatyana", 3);
        stGroup2.addStudent(student8);
        stGroup2.addStudent(student9);
        stGroup2.addStudent(student10);
        stGroup2.addStudent(student15);
        stGroup2.addStudent(student11);
        stGroup2.addStudent(student12);

        // GROUP 3
        Student student5 = new Student("John", 10);
        Student student6 = new Student("Semen", 2);
        Student student7 = new Student("Tatyana", 3);
        stGroup3.addStudent(student5);
        stGroup3.addStudent(student6);
        stGroup3.addStudent(student7);

        Stream stream1 = new Stream(Arrays.asList(stGroup1, stGroup2, stGroup3));

        // Iterable
        for (StudentGroup sGroup : stream1) {
            System.out.println(sGroup);
        }

        // Comparator
        List<StudentGroup> stream1Array = new ArrayList<>(
                List.of(stGroup1, stGroup2, stGroup3));

        System.out.println("\nstreamArray:\n" + stream1Array);

        Collections.sort(stream1Array, new StreamComparator());

        System.out.println("\nstreamArray after Comparator:\n" + stream1Array);

        // Sorting
        System.out.println("\nstream1:" + stream1);
        stream1.sort();
        System.out.println("\nstream1 after sorting:" + stream1.sgList);
    }
}
