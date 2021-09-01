package az.coders.ada_students.lessons.lesson_26.lambda;

public  class UserBuilder {
    final String firstName;
    final String lastName;

    public UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //Return the finally consrcuted User object
    public Person build() {
        Person user = new Person(this);
        return user;
    }


}
