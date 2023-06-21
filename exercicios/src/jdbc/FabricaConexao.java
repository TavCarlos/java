package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


//Essa classe será utilizada somente para estabelecer conexão com o banco de dados, assim há uma reaproveitamente do código.
public class FabricaConexao {

	public static Connection getConexao() {
		
		try {
			Properties properties = getProperties();
		final String url = properties.getProperty("banco.url");
		final String login = properties.getProperty("banco.usuario");
		final String password = properties.getProperty("banco.senha");
			return DriverManager.getConnection(url, login, password);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	private static Properties getProperties() throws IOException{
		Properties properties = new Properties();
		String path = "/conexao.properties";
		properties.load(FabricaConexao.class.getResourceAsStream(path));
		return properties;
	}
}
