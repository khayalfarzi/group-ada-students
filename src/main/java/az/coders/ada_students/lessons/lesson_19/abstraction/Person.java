package az.coders.ada_students.lessons.lesson_19.abstraction;

import java.util.Objects;

public class Person extends Human implements Ability {

    public static final long uuid = 1L;

    private String eye;

    private String nose;

    private String teeth;

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public String getNose() {
        return nose;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public String getTeeth() {
        return teeth;
    }

    public void setTeeth(String teeth) {
        this.teeth = teeth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return eye.equals(person.eye) && nose.equals(person.nose) && teeth.equals(person.teeth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), eye, nose, teeth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "eye='" + eye + '\'' +
                ", nose='" + nose + '\'' +
                ", teeth='" + teeth + '\'' +
                '}';
    }

    @Override
    public void greet() {
        System.out.println("Hello !");
    }

    @Override
    public void write() {
        System.out.println("I am writing something ...");
    }

    @Override
    public int sayAge() {
        return getAge();
    }
}
