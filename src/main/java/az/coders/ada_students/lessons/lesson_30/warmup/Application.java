package az.coders.ada_students.lessons.lesson_30.warmup;

import java.sql.Statement;

public class Application {

    private final Statement statement = SQL.getStatement();
    private final QueryExecutor query = new QueryExecutor(statement);

    public void run() {

        Person person = new Person(1,
                "Khayal Farziyev",
                (byte) 23,
                Gender.MALE,
                "khayalfarzi@gmail.com");
        query.save(person);

    }
}
