package az.coders.ada_students.lessons.lesson_23.generics;

public class MainArrayList {

    public static void main(String[] args) {

        CustomArrayList<Integer> integers = new CustomArrayList<>(10);
        integers.add(19, 0);
        integers.add(20, 1);
        integers.add(256, 3);
        integers.add(345, 4);

        System.out.println(integers.get(2));
    }
}
