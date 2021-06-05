package az.coders.ada_students.lessons.lesson_4;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {

//        String a = "Hello", b = " Khayal Farziyev";
////        System.out.println(a + b);
////        System.out.println(a.concat(b));
//
//        int c = 5, d = 8, q = 9;
//        System.out.println(c + d + a + q + (d + c));
//
//        String str = String.format("%s Java I am %s", a, b);
//        System.out.println(str);

        Scanner scanner = new Scanner(System.in);
        boolean key = true;
        System.out.println("Commands : 'exit' - for break while");
        while (key) {

            System.out.println("Into the while: ");
            String com = scanner.next();

            if (com.equals("exit"))
                key = false;
        }
    }
}