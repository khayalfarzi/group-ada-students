package az.coders.ada_students.lessons.lesson_3;

public class StringExample {

    public static void main(String[] args) {
        char elem = 'a';
        String element = "Hello";
        String elementStr = "Hello";
        char[] arr = {'H', 'e', 'l', 'l', 'o'};

        System.out.println(element.length());

        String elementOne = new String("Hello");
        String elementTwo = new String("Hello");
        String elementThree = new String("Hello");
        String elementFour = new String("Hello");

        System.out.println(element.toUpperCase());
        System.out.println(element.toLowerCase());
        System.out.println(element.charAt(4));
        System.out.println(element.substring(2));
        System.out.println(element.substring(1, 5));

        String str = "         Ada             Students                       ";
        System.out.println(str);
        System.out.println(str.trim());
    }
}