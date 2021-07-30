package az.coders.ada_students.lessons.lesson_17.polymorphism;

public class Student implements Ability {

    @Override
    public void write() {
        System.out.println("Student has a writing skill");
    }

    @Override
    public void write(String param) {

    }

    @Override
    public void write(String param, String param2) {

    }

    @Override
    public void read() {
        System.out.println("Student has a reading skill");
    }
}
