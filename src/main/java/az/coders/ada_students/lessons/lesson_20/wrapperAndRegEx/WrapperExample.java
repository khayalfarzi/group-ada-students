package az.coders.ada_students.lessons.lesson_20.wrapperAndRegEx;

import az.coders.ada_students.lessons.lesson_20.innerAndOutter.Person;

public class WrapperExample {

    public static void main(String[] args) {

        int a = 5;
        Integer aa = 5;

        Person person = new Person();


        String number = "ngasimzada@12345";
        StringBuilder builder = new StringBuilder(number);
        builder.reverse();
        String code = builder.substring(5);

        Integer codeI = Integer.parseInt(code);

        Integer numberInt = Integer.parseInt(number);

//        Double.parseDouble()

        // Boxing
        int c = 5;
        Integer cc = c;

        // UnBoxing
        Integer dd = 89;
        int d = dd;
    }
}