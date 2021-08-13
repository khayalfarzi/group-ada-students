package az.coders.ada_students.lessons.lesson_21;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now(ZoneId.of("UTC"));
        System.out.println(localDate);

        localDate = LocalDate.of(2020, 11, 8);
        System.out.println(localDate);

        localDate = LocalDate.of(2020, Month.NOVEMBER, 8);
        System.out.println(localDate);

//        localDate=LocalDate.now().toString()
    }
}