package az.coders.ada_students.lessons.lesson_10;

public class Solution_1 {

    public int reverse(int x) {
        int reversedNumber = 0;

        String numberStr = String.valueOf(x);
        StringBuilder builder = new StringBuilder(numberStr);

        if (numberStr.startsWith("-")) {
            // Negative number
            builder.deleteCharAt(0); // delete - symbol
            numberStr = String.format("%s%s", "-", builder.reverse());
        } else {
            // Positive number
            numberStr = builder.reverse().toString();
        }

        try {
            // parse String to Integer
            reversedNumber = Integer.parseInt(numberStr);
        } catch (Exception ignored) {
            // If number is not integer then return 0
        }

        return reversedNumber;
    }
}
