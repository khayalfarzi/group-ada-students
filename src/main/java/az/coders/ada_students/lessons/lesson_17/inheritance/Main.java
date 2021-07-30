package az.coders.ada_students.lessons.lesson_17.inheritance;

public class Main {

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.number); //5
        System.out.println(a.get()); //get method is in the A class

        B b = new B();
        System.out.println(b.number); //5
        System.out.println(b.get()); //get method is in the B class
        System.out.println(b.methodInBClass()); //1

        A ab = new C();
        System.out.println(ab.number); // 5 // Nabat --
        System.out.println(ab.get()); //get method is in the B class
    }
}
