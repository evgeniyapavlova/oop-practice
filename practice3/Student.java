package practice3;

public class Student implements Comparable<Student> {
    public String name;
    public static int idInner = 1;
    public int id;

    public Student(String name) {
        this.name = name;
        this.id = idInner;
        incrementStaticId();
    }

    private static void incrementStaticId() {
        idInner++;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.length() - o.name.length();
    }
}
