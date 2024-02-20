package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnector {

    private static Connection connection;
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/%s";

    public static void createConnection(String username, String password, String dbName) throws SQLException {
        String jdbcString = String.format(CONNECTION_STRING, dbName);

        connection = DriverManager.getConnection(jdbcString, username, password);
    }

    public static Connection getConnection() { return connection; }
}
