package az.coders.ada_students.lessons.lesson_12;

public class Main {

    public static void main(String[] args) {

        // Crate object
        // Person : class
        // p1 : reference or object
        Person p1 = new Person();

        p1.name = "Nadir";
        p1.surname = "Jabbarli";
        p1.age = 19;
        p1.gender = "Male";
        p1.print();
        System.out.println(p1);
        System.out.println(p1.checkName("Nadirr"));
    }
}