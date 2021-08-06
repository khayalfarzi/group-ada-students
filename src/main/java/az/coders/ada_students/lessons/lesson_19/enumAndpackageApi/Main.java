package az.coders.ada_students.lessons.lesson_19.enumAndpackageApi;

import az.coders.ada_students.lessons.lesson_13.Person;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {


        System.out.println("CLASS EXAMPLE");
        // Show all days from DayOfWeek class
        System.out.println(DayOfWeek.MONDAY);
        System.out.println(DayOfWeek.TUESDAY);
        System.out.println(DayOfWeek.WEDNESDAY);
        System.out.println(DayOfWeek.THURSDAY);
        System.out.println(DayOfWeek.FRIDAY);
        System.out.println(DayOfWeek.SUNDAY);
        System.out.println(DayOfWeek.SATURDAY);

        System.out.println("ENUM EXAMPLE");
        System.out.println(DayOfWeekEnum.MONDAY);

        // Show all days from DayOfWeek enum
        for (DayOfWeekEnum dayOfWeek : DayOfWeekEnum.values()) {
            System.out.println(dayOfWeek);
        }

        // switch example
        enumWithSwitch(DayOfWeekEnum.FRIDAY);

        LocalDateTime dateTime = LocalDateTime.now();

        Person person = new Person();
    }

    public static void enumWithSwitch(DayOfWeekEnum dayOfWeek) {

        switch (dayOfWeek) {
            case FRIDAY:
                System.out.println("Today is friday");
            case MONDAY:
                System.out.println();
            case SUNDAY:
                System.out.println();
        }
    }
}
