package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * padrão DAO -> objetivo é isolar todo o código de acesso a dados fornecendo para aplicação métodos 
 * de fácil chamada e obter aquilo que você quer.
 * Encapsular toda a complexidade de infraestrutura de acessar o banco de dados, para consegui utilizar 
 * os métodos muito mais simples ao invés de ficar misturando código de acesso a banco com código de regras de negócio. 
 * */


public class DAO {

	private Connection conexao;
	
	
	public int incluir(String sql, Object... atributos) {
		
		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			adicionarAtributos(stmt, atributos);
			
			
			if(stmt.executeUpdate() > 0) {
				ResultSet resultado = stmt.getGeneratedKeys();
				
				if(resultado.next()) {
					return resultado.getInt(1);
				}
			}
			
			return -1;
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	
	
	private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
		
		int index = 1;
		
		for(Object atributo: atributos) {
			if(atributo instanceof String) {
				stmt.setString(index, (String) atributo);
			} else if (atributo instanceof Integer) {
				stmt.setInt(index, (Integer) atributo);
			}
		}
		index ++;
	}
	
	
	public void close() {
		
		try {
			getConexao().close();
		} catch(SQLException e) {
			
		} finally{
			conexao = null;
		}
	}
	
	
	
	private Connection getConexao() {
		
		try {
			if(conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch(SQLException e){
			
		}
		
		conexao = FabricaConexao.getConexao();
		return conexao;
	}
}
