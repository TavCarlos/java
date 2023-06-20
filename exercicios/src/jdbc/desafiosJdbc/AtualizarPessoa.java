package jdbc.desafiosJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.FabricaConexao;

public class AtualizarPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o Id: ");
		int id = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Por qual nome você gostaria de alterar? ");
		String novoNome = entrada.nextLine();
		
		String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		Connection conexao = FabricaConexao.getConexao();		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, novoNome);
		stmt.setInt(2, id);
		stmt.execute();
		
		System.out.println("Dado alterado com sucesso");
		System.out.println("Deseja visualizar a tabela? (s/n)");
		String visualizar = entrada.nextLine();
		
		if("s".equalsIgnoreCase(visualizar)) {
			
			sql = "SELECT * FROM pessoas";
			stmt = conexao.prepareStatement(sql);
			ResultSet resultado = stmt.executeQuery();
			
			while(resultado.next()) {
				int codigo = resultado.getInt("codigo");
				String nome = resultado.getString("nome");
				System.out.println(codigo + " => " + nome);
			}
		}
		
		System.out.println("Sessão encerrada.");
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
