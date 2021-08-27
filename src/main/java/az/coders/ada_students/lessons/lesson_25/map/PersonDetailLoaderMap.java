package az.coders.ada_students.lessons.lesson_25.map;

import java.util.HashMap;
import java.util.Map;

public class PersonDetailLoaderMap {

    public static final Map<Integer, Person> map = new HashMap<>();

    public static void load() {
        PersonDetailLoader.load();
        for (Person person : PersonDetailLoader.people) {
            map.put(person.getId(), person);
        }
    }
}