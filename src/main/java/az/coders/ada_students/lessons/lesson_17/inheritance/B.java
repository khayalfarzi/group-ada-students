package az.coders.ada_students.lessons.lesson_17.inheritance;

public class B extends A {

    public int methodInBClass() {
        number = 9;
        return 1;
    }

    @Override
    public String get() {
        number = 8;
        return "get method is in the B class";
    }

    // 50 methods

}
