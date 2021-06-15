package az.coders.ada_students.lessons.lesson_7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zehmet olmasa element sayini daxil edin");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Eded daxil edin");
            array[i] = scanner.nextInt();
        }

        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s ", array[i]);
        }
        System.out.print("}");
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
