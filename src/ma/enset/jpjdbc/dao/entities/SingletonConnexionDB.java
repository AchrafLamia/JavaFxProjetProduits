package ma.enset.jpjdbc.dao.entities;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SingletonConnexionDB {
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_catalogue","root","");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static Connection getConnection() {
        return connection;
    }
}
