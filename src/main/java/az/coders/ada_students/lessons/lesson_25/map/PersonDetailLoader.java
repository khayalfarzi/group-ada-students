package az.coders.ada_students.lessons.lesson_25.map;

import java.util.ArrayList;
import java.util.List;

public class PersonDetailLoader {

    public static final List<Person> people = new ArrayList<>();

    public static void load() {
        people.add(new Person(1, "a", "aa"));
        people.add(new Person(2, "b", "bb"));
        people.add(new Person(3, "c", "cc"));
        people.add(new Person(4, "d", "dd"));
        people.add(new Person(5, "f", "ff"));
        people.add(new Person(6, "g", "gg"));
    }
}
