import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCJ {
    private static final String URL = "jdbc:postgresql://localhost:5432/Event_System";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Erketai2008";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
