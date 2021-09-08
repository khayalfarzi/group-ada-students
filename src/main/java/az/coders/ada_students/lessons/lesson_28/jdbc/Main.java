package az.coders.ada_students.lessons.lesson_28.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private final static String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String username = "postgres";
    private static final String pass = "root";

    public static void main(String[] args) throws SQLException {

        Connection connection = getConnection();

        System.out.println("Is closed? " + connection.isClosed()); // false
        connection.close();
        System.out.println("Is closed? " + connection.isClosed()); // true


        Statement statement = connection.createStatement();
        System.out.println(
                statement.execute("insert into students (id, name, surname) values (1, 'Nabat', 'Gasimzada')"));
        System.out.println(
                statement.execute("insert into students (id, name, surname) values (2, 'Nadir', 'Jabbarli')"));
        System.out.println(
                statement.execute("insert into students (id, name, surname) values (3, 'Toghrul', 'Pashazade')"));

        statement.executeQuery("select * from students");
    }

    private static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}