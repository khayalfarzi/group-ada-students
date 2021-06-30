package az.coders.ada_students.lessons.lesson_10;

public class RecursionExample {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialTwo(5));
    }

    public static int factorial(int number) {
        int elem = 1;
        if (number != 1) {
            elem = number * factorial(number-1);
        }
        return elem;
    }

    public static int factorialTwo(int number) {
        return number != 1 ? number * factorial(number-1):1;
    }
}