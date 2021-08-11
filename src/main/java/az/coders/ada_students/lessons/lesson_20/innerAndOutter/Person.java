package az.coders.ada_students.lessons.lesson_20.innerAndOutter;

public class Person {

    private String name;

    private String surname;

    private int age;

    private Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        this.gender = Gender.MALE;
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private enum Gender {
        MALE, FEMALE
    }
}
