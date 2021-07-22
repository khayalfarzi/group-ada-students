package az.coders.ada_students.lessons.lesson_15.inheritance;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Nadir");
        System.out.println(person.getName());
        System.out.println(person);

        Employer employer = new Employer();
        employer.setAge(23);
        System.out.println(employer.getAge());
        System.out.println(employer);

        Programmer programmer = new Programmer();
        programmer.setBonuses(8954.95);
        System.out.println(programmer.getBonuses());
        System.out.println(programmer);
    }
}