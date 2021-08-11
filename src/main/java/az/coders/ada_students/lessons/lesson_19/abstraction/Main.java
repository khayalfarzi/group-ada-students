package az.coders.ada_students.lessons.lesson_19.abstraction;

public class Main {

    public static void main(String[] args) {

        // This is normal class and we can get object to Person
        Person person = new Person();
        person.setAge(23);
        person.sayAge();
        person.write();


        // We can not get object for Human because of abstraction
//        Human human = new Human();

        // change
    }
}