package az.coders.ada_students.lessons.lesson_23.generics;

public class Main {

    public static void main(String[] args) {

        ObjectExample objectExample = new ObjectExample();
        objectExample.setType("this is string");
        System.out.println(objectExample.getType());

        ObjectWithGenericsExample<String> owge = new ObjectWithGenericsExample<>();
        owge.setType("Generic with string");
        System.out.println(owge.getType());

        ObjectWithGenericsExample<Integer> owgei = new ObjectWithGenericsExample<>();
        owgei.setType(2);
        System.out.println(owgei.getType());

        ObjectWithGenericsExample<Person> owgep = new ObjectWithGenericsExample<>();
        owgep.setType(new Person("person"));
        System.out.println(owgep.getType());

        ObjectWithGenericsExample owget;
        owget = new ObjectWithGenericsExample<Integer>();
    }
}
