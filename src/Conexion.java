import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection getConexion() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/persistencia_java_se","postgres", "123" );
            if (connection != null){
                System.out.println("Conexion exitosa" + connection);
            }
        } catch (SQLException e) {
            System.out.println("NO se pudo conectar" + e);
        }

        return  connection;
    }
}
