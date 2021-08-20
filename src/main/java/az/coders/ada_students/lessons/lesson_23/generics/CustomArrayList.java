package az.coders.ada_students.lessons.lesson_23.generics;

public class CustomArrayList<M extends Object> {

    private final Object[] arr;

    public CustomArrayList(int bound) {
        this.arr = new Object[bound];
    }

    public void add(M item, int index) {
        arr[index] = item;
    }

    public M get(int index) {
        return (M) arr[index];
    }
}
