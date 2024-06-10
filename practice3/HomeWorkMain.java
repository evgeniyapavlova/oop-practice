package practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWorkMain {
    public static void main(String[] args) {
        StudentGroup stGroup1 = new StudentGroup(new String[] { "Anna", "Kate", "Alexander", "Dmitry" });
        StudentGroup stGroup2 = new StudentGroup(new String[] { "John",
                "Semen",
                "Tatyana",
                "John",
                "Semen",
                "Tatyana", });
        StudentGroup stGroup3 = new StudentGroup(new String[] { "Noah",
                "Olivia",
                "Peter",
                "Quinn",
                "Rachel",
                "Samuel",
                "Tina" });
        StudentGroup stGroup4 = new StudentGroup(new String[] { "Ivan", "Alexey", "Igor", "Dmitry" });
        StudentGroup stGroup5 = new StudentGroup(new String[] { "Liam", "Mia" });
        StudentGroup stGroup6 = new StudentGroup(new String[] { "Karen" });
        StudentGroup stGroup7 = new StudentGroup(new String[] { "Grace",
                "Henry",
                "Isabella",
                "Jack" });
        StudentGroup stGroup8 = new StudentGroup(new String[] { "Emily" });
        StudentGroup stGroup9 = new StudentGroup(new String[] { "Charlie", "David" });
        StudentGroup stGroup10 = new StudentGroup(new String[] { "Alice", "Bob" });

        Stream stream1 = new Stream(Arrays.asList(stGroup1, stGroup2, stGroup3));
        Stream stream2 = new Stream(Arrays.asList(stGroup4, stGroup5, stGroup6, stGroup7, stGroup8));
        Stream stream3 = new Stream(Arrays.asList(stGroup9, stGroup10));

        for (StudentGroup sGroup : stream1) {
            System.out.println(sGroup);
        }
        System.out.println();
        for (StudentGroup sGroup : stream2) {
            System.out.println(sGroup);
        }
        System.out.println();

        // Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий
        // интерфейс Iterable
        for (StudentGroup sGroup : stream3) {
            System.out.println(sGroup);
        }
        System.out.println();

        // Создать класс StreamComparator, реализующий сравнение количества групп,
        // входящих в Поток;
        List<Stream> streamsArray = new ArrayList<>(List.of(stream1, stream2, stream3));
        System.out.println("\n streamsArray: \n" + streamsArray);
        Collections.sort(streamsArray, new StreamComparator());
        System.out.println("\n streamsArray after comparator: \n" + streamsArray);

        // Создать класс ПотокСервис, добавив в него метод сортировки списка потоков,
        // используя созданный StreamComparator
        StreamService streamService = new StreamService(Arrays.asList(stream1, stream2, stream3));
        System.out.println("\n streamService: \n" + streamService);
        streamService.sort();
        System.out.println("\n streamService after sorting: \n" + streamService);

    }
}
