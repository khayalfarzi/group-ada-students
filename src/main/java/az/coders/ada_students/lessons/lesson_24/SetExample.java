package az.coders.ada_students.lessons.lesson_24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Nabat");
        names.add("Nabat");
        names.add("Nadir");
        names.add("Toghrul");

        names.forEach(System.out::println);

        Set<String> namesS = new HashSet<>();
        namesS.add("Nabat");
        namesS.add("Nabat");
        namesS.add("Nadir");

        namesS.forEach(System.out::println);
    }
}
