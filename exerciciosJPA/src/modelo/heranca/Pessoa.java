package modelo.heranca;

import javax.persistence.MappedSuperclass;

@MappedSuperclass //Não cria a tabela mãe(this), mas cria as tabelas filhas com os atributos herdados por herança.
public class Pessoa {

	private String nome;
	
	private String endereço;
	
	public Pessoa() {

	}

	public Pessoa(String nome, String endereço) {
		this.nome = nome;
		this.endereço = endereço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
}
