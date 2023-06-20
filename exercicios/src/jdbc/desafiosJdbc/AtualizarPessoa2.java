package jdbc.desafiosJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.FabricaConexao;

public class AtualizarPessoa2 {

	public static void main(String[] args) throws SQLException{
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o id: ");
		int id = teclado.nextInt();
		teclado.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas where codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa pessoa = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));
			System.out.println("O nome atual é: " + pessoa.getNome());
			
			stmt.close();

			System.out.print("Para qual nome deseja alterar? ");
			String novoNome = teclado.nextLine();
			
			sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, novoNome);
			stmt.setInt(2, id);
			stmt.execute();
			System.out.println("Nome alterado com sucesso!");
		} else {
			System.out.println("Cadastro não encontrado.");
		}
		
		stmt.close();
		conexao.close();
		teclado.close();
	}
}
