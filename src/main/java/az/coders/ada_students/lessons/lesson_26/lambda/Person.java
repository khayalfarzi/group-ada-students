package az.coders.ada_students.lessons.lesson_26.lambda;


public class Person {
    private final String firstName; // required
    private final String lastName; // required

    Person(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    //All getter, and NO setter to provde immutability
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}

