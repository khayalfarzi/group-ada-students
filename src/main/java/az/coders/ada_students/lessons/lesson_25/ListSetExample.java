package az.coders.ada_students.lessons.lesson_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListSetExample {

    public static void main(String[] args) {

        print(
                distinctAndSortList(
                        generateRandomList(1000, 500)
                )
        );

    }


    private static List<Integer> generateRandomList(int bound, int randomBound) {
        List<Integer> randomIntegers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < bound; i++) {
            randomIntegers.add(random.nextInt(randomBound));
        }

        return randomIntegers;
    }

    private static List<Integer> distinctAndSortList(List<Integer> list) {

        // create new list as named newList
        // create fori for list
        // check if element exist newList
        // if exist then do nothing
        // if not exist then add element to newList

        return null;
    }

    private static void print(List<Integer> ints) {
        ints.forEach(System.out::println);
    }
}
