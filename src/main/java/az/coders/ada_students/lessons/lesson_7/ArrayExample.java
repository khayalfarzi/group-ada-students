package az.coders.ada_students.lessons.lesson_7;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.printf("%s %s %s", a, b, c);

        int[] array = new int[5];
        // [0, 0, 0, 0, 0]
        //  0  1  2  3  4

        array[0] = 5;
        array[1] = 6;
        array[2] = 7;
        array[3] = 9;
        array[4] = 9;

        int[] array1 = {3, 6, 7, 8, 9, 9, 6, 4, 3, 2};

        String[] array2 = {"aassd", "ac","dfa","ac","ac",};

    }
}
