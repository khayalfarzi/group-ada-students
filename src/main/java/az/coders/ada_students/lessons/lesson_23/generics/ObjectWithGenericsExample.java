package az.coders.ada_students.lessons.lesson_23.generics;

public class ObjectWithGenericsExample<T> {

    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
