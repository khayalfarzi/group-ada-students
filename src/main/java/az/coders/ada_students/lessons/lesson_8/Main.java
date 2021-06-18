package az.coders.ada_students.lessons.lesson_8;

public class Main {

    public static void main(String[] args) {
        ThreadExample example1 = new ThreadExample();
        example1.start();
        ThreadExample example2 = new ThreadExample();
        example2.start();
        ThreadExample example3 = new ThreadExample();
        example3.start();
        ThreadExample example4 = new ThreadExample();
        example4.start();
    }
}
