package az.coders.ada_students.lessons.lesson_3;

import java.util.Scanner;

public class SwitchExercise {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        int element = SCANNER.nextInt();

        if (element >= 0 && element <= 4)
            System.out.println("Suspenso");
        else {
            switch (element) {
                case 5:
                    System.out.println("Aprobado");
                case 6:
                    System.out.println("Bien");
            }
        }
    }
}
