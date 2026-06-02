import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println("Database Connection Failed!");
            return null;
        }
    }
}