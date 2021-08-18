package az.coders.ada_students.lessons.lesson_22.market_app.util;

import java.time.LocalTime;

public class Printer {

    public static void print(Object item) {
        LocalTime date = LocalTime.now();
        System.out.printf("%s = %s", date, item);
    }
}
