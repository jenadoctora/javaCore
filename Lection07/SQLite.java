package javaCore.git.Lection07;

import java.sql.*;

public class SQLite {

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite.lesson7db.db");
        statement = connection.createStatement();
        statement.executeUpdate("INSERT into lesson07 values(1,'root', 'admin1234')");



        connection.close();

    }

    private static void performCreateDB() {
    }

}
