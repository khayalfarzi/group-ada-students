package az.coders.ada_students.lessons.lesson_7;

public class EqualDigitNumberExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        if ((i + j) == (k + l))
                            System.out.printf("%s%s%s%s \n", i, j, k, l);
                    }
                }
            }
        }
    }
}
