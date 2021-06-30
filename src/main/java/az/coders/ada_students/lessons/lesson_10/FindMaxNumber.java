package az.coders.ada_students.lessons.lesson_10;

import java.util.Scanner;

public class FindMaxNumber {

    public static void main(String[] args) {
        int first = getNumber();
        int second = getNumber();
        int third = getNumber();

        findMaxNumber(first, second, third);
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        return checkNumber(number);
    }

    public static int checkNumber(int number) {
        if (number > 0)
            return number;
        else {
            System.out.println("The number you have entered is negative. \n Please enter positive number...");
            return getNumber();
        }
    }

    public static void findMaxNumber(int numOne, int numTwo, int numThree) {
        System.out.print("Max number is : ");
        System.out.println(Math.max(numOne, Math.max(numTwo, numThree)));
    }
}