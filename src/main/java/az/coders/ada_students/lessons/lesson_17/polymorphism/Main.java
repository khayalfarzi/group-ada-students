package az.coders.ada_students.lessons.lesson_17.polymorphism;

public class Main {
    public static void main(String[] args) {

        Ability ability;

        ability = new Student();
        ability.write();
        ability.read();

        ability = new Teacher();
        ability.write();
        ability.read();

        ability.write("");

        ability.write("", "");
    }
}
