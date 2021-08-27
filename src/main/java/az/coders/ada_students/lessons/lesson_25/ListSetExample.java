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
        Random random = new Random(randomBound);

        for (int i = 0; i < bound; i++) {
            randomIntegers.add(random.nextInt());
        }

        return randomIntegers;
    }

    private static List<Integer> distinctAndSortList(List<Integer> list) {


    }

    private static void print(List<Integer> ints) {
        ints.forEach(System.out::println);
    }
}