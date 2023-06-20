package jdbc.desafiosJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jdbc.FabricaConexao;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.print("Buscar nome: ");
		String buscador = entrada.nextLine();
		
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%"+buscador+"%");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int id = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(id, nome));
		}
		
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getCodigo() + " => " + pessoa.getNome());
		}
		
		
		stmt.close();
 		conexao.close();
 		entrada.close();
	}
}
