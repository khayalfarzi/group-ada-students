package az.coders.ada_students.lessons.lesson_15.vacancy_app;

public class Vacancy {

    private String name;
    private String description;
    private double salary;
    private String location;

    public Vacancy() {
    }

    public Vacancy(String name, String description, double salary, String location) {
        this.name = name;
        this.description = description;
        this.salary = salary;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}
