package az.coders.ada_students.lessons.lesson_24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Nabat");
        names.add("Nadir");
        names.add("Toghrul");

        List<String> addAllExample = new ArrayList<>();
        addAllExample.addAll(names);

        names.forEach(System.out::println);

        LinkedList<String> namesL = new LinkedList<>(names);

        namesL.addFirst("Khayal");

        namesL.forEach(System.out::printf);
    }
}
