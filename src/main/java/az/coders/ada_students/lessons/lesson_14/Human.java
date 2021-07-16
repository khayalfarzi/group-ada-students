package az.coders.ada_students.lessons.lesson_14;

public class Human {

    public static final int id = 5;
    public String name;
    protected int age;
    int iq;
    private String surname;

    public Human() {
    }

    public Human(String name, int age, int iq, String surname) {
        this.name = name;
        this.age = age;
        this.iq = iq;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iq=" + iq +
                ", surname='" + surname + '\'' +
                '}';
    }
}
