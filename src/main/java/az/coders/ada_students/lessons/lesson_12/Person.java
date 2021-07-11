package az.coders.ada_students.lessons.lesson_12;

public class Person {

    // Class members
    // fields
    // property
    // variable
    public String name;  // instance variables

    public String surname;

    public int age;

    public String gender;

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println(this);
    }

    public boolean checkName(String name) {
        int age = 56; // local variables
        return this.name.equals(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}