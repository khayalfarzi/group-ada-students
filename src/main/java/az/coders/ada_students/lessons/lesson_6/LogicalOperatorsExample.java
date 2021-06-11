package az.coders.ada_students.lessons.lesson_6;

public class LogicalOperatorsExample {

    public static void main(String[] args) {
        boolean a = true, b = true, c = true;

        if (!(a = false) && (b = false) && (c = false)) {
            System.out.println(a + "" + b + "" + c);

            if ((a = false) & (b = false) & (c = false)) {
            }
            System.out.println(a + "" + b + "" + c);
        }
    }
}
