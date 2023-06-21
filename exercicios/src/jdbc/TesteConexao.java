package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TesteConexao {

	public static void main(String[] args) throws SQLException, IOException{
		//URL -> é usada para estabelecer uma conexão com o banco de dados usando o driver JDBC específico. no exmeplo, mysql.
		//jdbc:mysql:// -> indica que você está usando o driver JDBC para se conectar a um banco de dados MySQL
		//verifyServerCertificate=false -> indica que o certificado do servidor não será verificado durante a conexão SSL
		//useSSL=true -> conexão criptografada usando SSL, garantindo a segurança dos dados entre o Java e o banco de dados.
		
		Properties properties = getProperties();
		final String url = properties.getProperty("banco.url");
		final String usuario = properties.getProperty("banco.usuario");
		final String senha = properties.getProperty("banco.senha");
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("conexão efetuada com sucesso!");
		
		conexao.close();
	}
	
	private static Properties getProperties() throws IOException {
		Properties properties = new Properties();
		String path = "/conexao.properties";
		properties.load(TesteConexao.class.getResourceAsStream(path));
		return properties;
	}
}

/*API -> JDBC (Java Database Connectivity) define um conjunto de interfaces que permite que aplicativos 
 Java se conectem a um banco de dados e executem operações relacionadas a bancos de dados. O construir 
 um driver JDBC, você precisa implementar várias interfaces e fornecer a implementação dos métodos correspondentes.*/
 