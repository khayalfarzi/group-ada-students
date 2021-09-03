package az.coders.ada_students.lessons.lesson_27;

import java.util.*;

public class OptionalExample {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Person person = new Person(1, "Nadir");

        Optional<Person> optional = Optional.of(person);

        System.out.println(optional);

        optional.get();

        List<Optional<Person>> list = Arrays.asList(
                Optional.of(new Person(1, "Nadir")),
                Optional.of(new Person(2, "Toghrul")),
                Optional.of(new Person(3, "Nabat")),
                Optional.of(new Person(4, "Khayal"))
                );

        System.out.print("Enter id: ");

        int id = sc.nextInt();

        List<Person> p1 = new ArrayList<>();
        list.forEach(p -> {
            if (p.get().getId() == id)
                p1.add(p.get());
        });

        if (list.size() == 1 && list.get(0).isPresent())
            System.out.println(list.get(0).get().getName());

        Person p = list.get(id).orElseThrow(() ->
                new RuntimeException("Person id not founded"));
        System.out.println(p.getName());
    }
}
