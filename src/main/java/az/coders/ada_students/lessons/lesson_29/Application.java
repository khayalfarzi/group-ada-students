package az.coders.ada_students.lessons.lesson_29;

import java.sql.Statement;

public class Application {

    private final Statement statement = SQL.getStatement();
    private final QueryExecutor query = new QueryExecutor(statement);

    public void run() {

        Person person = new Person();
        query.save(person);
    }
}
