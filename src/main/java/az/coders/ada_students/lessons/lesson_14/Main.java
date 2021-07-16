package az.coders.ada_students.lessons.lesson_14;

public class Main {

    public static void main(String[] args) {

        // No arg constructor
        ConstructorExample example = new ConstructorExample();
        System.out.println(example);

        // Required arg constructor
        ConstructorExample example1 = new ConstructorExample("Constructor example");
        System.out.println(example1);

        // All arg constructor
        ConstructorExample example2 = new ConstructorExample("Constructor example", 45);
        System.out.println(example2);

        Human human=new Human();
        System.out.println(Human.id);
    }
}