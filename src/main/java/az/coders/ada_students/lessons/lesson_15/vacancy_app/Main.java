package az.coders.ada_students.lessons.lesson_15.vacancy_app;

import java.util.Scanner;

public class Main {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" =====> WELCOME TO THE APPLICATION <=====");
        System.out.print("Please enter vacancy name: ");
        System.out.println();
        String key = SC.next();

        showData(findByKey(key));

        System.out.println();
        System.out.println("=====> APPLICATION ENDED SUCCESSFULLY <=====");
    }

    private static Vacancy[] findByKey(String key) {
        Data.loadData();

        Vacancy[] arr = new Vacancy[5];
        for (int i = 0; i < Data.vacancies.length; i++) {
            if (Data.vacancies[i].getName().contains(key)
                    || Data.vacancies[i].getDescription().contains(key))
                arr[i] = Data.vacancies[i];
        }

        return arr;
    }

    private static void showData(Vacancy[] arr) {
        for (Vacancy vacancy : arr) {
            if (vacancy != null)
                System.out.println(vacancy);
        }
    }
}
