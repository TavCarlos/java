package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//Essa classe será utilizada somente para estabelecer conexão com o banco de dados, assim há uma reaproveitamente do código.
public class FabricaConexao {

	public static Connection getConexao() {
		
		try {
		final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
		final String login = "root";
		final String password = "Deathgaze1998@";
			return DriverManager.getConnection(url, login, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
