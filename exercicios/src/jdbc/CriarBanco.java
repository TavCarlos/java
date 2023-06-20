package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


//no dia a dia, o banco de dados é criado a partir do banco de dados mesmo, não através de linha de código.
public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		String login = "root";
		String senha = "Deathgaze1998@";
		
		
		Connection conexao = DriverManager.getConnection(url, login, senha);
		System.out.println("conexão estabeelcida.");
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco de dados criado com sucesso!");
		conexao.close();
	}
}
