package az.coders.ada_students.lessons.lesson_14;

public class ConstructorExample {

    private String name;

    private int age;

    // No arg constructor
    public ConstructorExample() {
    }

    // Required arg constructor
    public ConstructorExample(String name) {
        this.name = name;
    }

    // All arg constructor
    public ConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "ConstructorExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
