package az.coders.ada_students.lessons.lesson_25;

import java.util.*;
import java.util.stream.Collectors;

public class ListSetExample {

    public static void main(String[] args) {

        print(
                distinctAndSortList(
                        generateRandomList(1000, 500)
                )
        );

    }


    public static List<Integer> generateRandomList(int bound, int randomBound) {
        List<Integer> randomIntegers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < bound; i++) {
            randomIntegers.add(random.nextInt(randomBound));
        }

        return randomIntegers;
    }

    private static List<Integer> distinctAndSortList(List<Integer> list) {

        // create new list as named newList
        List<Integer> newList = new ArrayList<>();

        // create fori for list
        for (int elem : list) {

            // check if element exist newList
            if (!newList.contains(elem))
                // if not exist then add element to newList
                newList.add(elem);
            // if exist then do nothing
        }

        return newList.stream().sorted().collect(Collectors.toList());
    }

    private static List<Integer> distinctAndSortListWithSet(List<Integer> list) {
        return new ArrayList<>(new HashSet<Integer>(list));
    }

    public static void print(List<Integer> ints) {
        ints.forEach(System.out::println);
    }
}
