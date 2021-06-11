package az.coders.ada_students.lessons.lesson_6;

import java.util.Scanner;

//Tricky
public class DigitCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String element = String.format("%s", scanner.next());
        System.out.println(element.length());
    }
}
