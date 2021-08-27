package az.coders.ada_students.lessons.lesson_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(ints);

        for (int elem : ints)
            System.out.println(elem);

        int index = 0;
        while (ints.iterator().hasNext()) {
            ints.get(index);
            // some code

            index++;
        }
    }
}
