import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/trabalhofinal", "postgres",
					"");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
