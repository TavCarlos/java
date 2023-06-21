package jdbc.desafiosJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.FabricaConexao;

public class DeletarPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o ID que deseja deletar: ");
		int id = teclado.nextInt();
		teclado.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa pessoa = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));
			stmt.close();
			
			System.out.println("Nome do usuário pesquisado: " + pessoa.getNome());
			System.out.println("Deseja continuar?(s/n)");
			String continuar = teclado.nextLine();
			
			if("s".equalsIgnoreCase(continuar)) {
				sql = "DELETE FROM pessoas WHERE codigo = ?";
				stmt = conexao.prepareStatement(sql);
				stmt.setInt(1, id);
				if(stmt.executeUpdate() > 0) { //executeUpdate -> retorna int quantas linhas foram afetadas 
					System.out.println("Cadastro deletado com sucesso!");
				} else {
					System.out.println("Ocorreu um erro. Tente novamente.");
				}
			} else {
				System.out.println("Operação não realizada.");
			}	
			
		} else {
			System.out.println("Cadastro não encontrado.");
		}
		
		stmt.close();
		conexao.close();
		teclado.close();
	}
}
