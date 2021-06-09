package az.coders.ada_students.lessons.lesson_5;

import java.util.Scanner;

public class TaskOneExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elem = Integer.MIN_VALUE;


        for (int i = 1; i < 4; i++) {
            System.out.printf("Enter %s. number : \n", i);
            int input = scanner.nextInt();
            if (elem < input)
                elem = input;
        }
        System.out.println(elem);
    }
}
