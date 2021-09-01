package az.coders.ada_students.lessons.lesson_26.lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExpressionExample {

    static final Consumer<Integer> p2 =
            i -> System.out.println(i);
    static final Predicate<Integer> lessThan5 =
            integer -> integer < 5;

    public static void main(String[] args) {
        List<Integer> integers = loadIntegers();

        showListElementsWithFor(integers);
        showListElementsWithLambda(integers);
        filterElementsLessThan5WithFor(integers);
        filterElementsLessThan5WithLambda(integers);

        User user;
        user = new User.UserBuilder("ad", "soyad")
                .age(11)
                .phone("phone")
                .build();

        System.out.println(user);
    }

    private static List<Integer> loadIntegers() {
        return Arrays.asList(1, 2, 3, 4, 8, 0, 6, 12, 3, 4, 95);
    }

    private static void showListElementsWithFor(List<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
    }

    private static void showListElementsWithLambda(List<Integer> integers) {
        integers.forEach(i -> System.out.println(i));
    }

    private static void filterElementsLessThan5WithFor(List<Integer> integers) {
        List<Integer> less = new ArrayList<>();

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) <= 5)
                less.add(integers.get(i));
        }

        System.out.println(less);
    }

    private static void filterElementsLessThan5WithLambda(List<Integer> integers) {
        integers.stream()
                .filter(integer -> integer < 5)
                .distinct()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Set<Integer> set = integers.stream()
                .filter(lessThan5)
                .collect(Collectors.toSet());

        Set<Integer> set1 = new HashSet<>(integers);

        System.out.println(set);
        System.out.println(set1);
    }
}