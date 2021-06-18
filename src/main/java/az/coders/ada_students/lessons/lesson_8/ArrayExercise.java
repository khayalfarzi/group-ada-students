package az.coders.ada_students.lessons.lesson_8;

import java.util.Scanner;

public class ArrayExercise {

    /**
     * 3x3
     * <p>
     * 0 0 0
     * 0 0 0
     * 0 0 0
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[][] arr = new int[length][length];

        // Fill the array
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        // end of the array filling part

        // Print array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // end of the printing part
    }
}
