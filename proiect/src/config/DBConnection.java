package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;

    private DBConnection() {
    }

    public static Connection getInstance() throws SQLException, ClassNotFoundException {
        if (connection == null) {
            String url = "jdbc:mysql://localhost:3306/proiect_pao";
            String userName = "root";
            String password = "root";

            connection = DriverManager.getConnection(url, userName, password);
        }
        System.out.println("Buongiorno signore, la connessione è stata stabilita!");
        return connection;
    }
}
