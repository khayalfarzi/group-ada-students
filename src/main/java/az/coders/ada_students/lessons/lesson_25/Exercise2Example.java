package az.coders.ada_students.lessons.lesson_25;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static az.coders.ada_students.lessons.lesson_25.ListSetExample.*;

public class Exercise2Example {

    public static void main(String[] args) {

        List<Integer> list = generateRandomList(1000, 10);
        showElementCount(list);
    }

    private static void showElementCount(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
    }
}
