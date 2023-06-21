package jdbc;

public class Pessoa {

	private int codigo;
	private String nome;
	
	Pessoa(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
}
