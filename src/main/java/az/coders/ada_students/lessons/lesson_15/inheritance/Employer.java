package az.coders.ada_students.lessons.lesson_15.inheritance;

public class Employer extends Person {

    private double salary;

    public Employer() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "salary=" + salary +
                '}';
    }
}
