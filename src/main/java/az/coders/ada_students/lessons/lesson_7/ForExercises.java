package az.coders.ada_students.lessons.lesson_7;

import java.util.Scanner;

public class ForExercises {

    public static void main(String[] args) {

//        for (int i = 0, j = 10; i < 10; i++, j--) {
//            System.out.printf("i= %s <=> j= %s%n", i, j);
//        }

        Scanner scanner = new Scanner(System.in);

        int outer = scanner.nextInt();
        int inner = scanner.nextInt();
        OUTER:
        for (int i = 0; i < outer; i++) {
            INNER:
            for (int j = 0; j < inner; j++) {

                if ((i * j) / 3 == 0) {
                    System.out.println("hasil= " + (i * j));
                    break OUTER;
                }
            }
            break OUTER;
        }
    }
}
