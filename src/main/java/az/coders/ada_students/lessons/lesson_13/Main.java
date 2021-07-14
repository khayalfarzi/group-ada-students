package az.coders.ada_students.lessons.lesson_13;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Toghrul");
        person.setSurname("Pashazade");
        person.setGender("Male");
        person.setAge(-20);

        System.out.println(person.getAge());

        System.out.println(person);
    }
}
