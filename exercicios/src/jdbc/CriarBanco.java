package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


//no dia a dia, o banco de dados é criado a partir do banco de dados mesmo, não através de linha de código.
public class CriarBanco {

	public static void main(String[] args) throws SQLException, IOException {
		
		
		Properties properties = getProperties();
		String url = properties.getProperty("banco.url");
		String login = properties.getProperty("banco.usuario");
		String senha = properties.getProperty("banco.senha");
		
		
		Connection conexao = DriverManager.getConnection(url, login, senha);
		System.out.println("conexão estabeelcida.");
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco de dados criado com sucesso!");
		conexao.close();
	}
	
	private static Properties getProperties() throws IOException{
		Properties properties = new Properties();
		String path = "/conexao.properties";
		properties.load(CriarBanco.class.getResourceAsStream(path));
		return properties;
		
	}
}
