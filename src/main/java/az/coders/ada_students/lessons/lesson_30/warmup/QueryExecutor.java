package az.coders.ada_students.lessons.lesson_30.warmup;

import java.sql.SQLException;
import java.sql.Statement;

public class QueryExecutor {

    private final Statement statement;

    public QueryExecutor(Statement statement) {
        this.statement = statement;
    }

    public Statement getStatement() {
        return statement;
    }

    public void save(Person person) {
        String values = String.format("%s,%s,%s,%s,%s",
                person.getId(),
                person.getFullName(),
                person.getAge(),
                person.getGender(),
                person.getEmail());
        String query =
                String.format(
                        "insert into person (id, full_name, age, gender, email) values (%s)",
                        values);
        try {
            getStatement().execute(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // must be written update, delete, get
}
