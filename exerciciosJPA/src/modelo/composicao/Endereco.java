package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String logradouro;
	private String complemento;
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	/*
	 * A classe 'Endereco' não é uma entidade, logo não possui uma tabela no banco de dados.
	 * 
	 * Com '@Embeddable', os atributos dessa classe serão transformados em colunas nas classes-entidades que
	 * tiverem 'Endereco' como atributos.
	 * 
	 * Logo, tanto a classe 'Funcionário' quanto a classe 'Fornecedor' terão as colunas logradouro quanto complemento.
	 * 
	 * */
}
