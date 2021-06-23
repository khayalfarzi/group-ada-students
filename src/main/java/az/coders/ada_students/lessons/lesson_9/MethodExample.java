package az.coders.ada_students.lessons.lesson_9;

public class MethodExample {

    // Recursion --

    public static void main(String[] args) {
        firstTypeMethod();
        secondTypeMethod(5);
        double d = thirdTypeMethod();
        System.out.println(d);
        int element = 81;
        System.out.println(
                fourthTypeMethod(element, "Hello Java methods", 6.6, 'A')
        );

        System.out.printf("Element: %s", element);
    }

    public static void firstTypeMethod() {
        System.out.println("First type method is calling...");
    }

    public static void secondTypeMethod(int element) {
        System.out.printf("Second type method starting with parameter : %s \n", element);
    }

    public static double thirdTypeMethod() {
        System.out.println("Third type method starting...");
        double element = 3.3;
        element = element * element;
        element = element + element;
        return element;
    }

    public static int fourthTypeMethod(int element, String element1, double element2, char element3) {
        System.out.println("Fourth type method starting...");
        System.out.println(element);
        System.out.println(element1);
        System.out.println(element2);
        System.out.println(element3);

        element = (int) Math.sqrt(element);
        return element;
    }
}