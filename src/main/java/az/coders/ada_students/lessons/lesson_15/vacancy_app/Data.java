package az.coders.ada_students.lessons.lesson_15.vacancy_app;

public class Data {

    public static final Vacancy[] vacancies = new Vacancy[5];

    public static void loadData() {
        vacancies[0] =
                new Vacancy("Java", "Java developer", 2000.20, "Baku/Azerbaijan");
        vacancies[1] =
                new Vacancy("C#", "C# developer", 7000.20, "Baku/Azerbaijan");
        vacancies[2] =
                new Vacancy("Backend developer", "Python developer, Java programmer", 5000.20, "Baku/Azerbaijan");
        vacancies[3] =
                new Vacancy("GO", "GO programmer", 3000.20, "Baku/Azerbaijan");
        vacancies[4] =
                new Vacancy("C++", "C++ developer", 8000.20, "Baku/Azerbaijan");
    }
}
