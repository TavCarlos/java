package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos") //modifica o nome da tabela
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prod_id") //modifica o nome da coluna
	private Long id;
	
	@Column(name = "prod_nome", length = 200, nullable = false)// modifica nome da coluna, varchar, obrigatório
	private String nome;
	
	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2) //precision -> 11 números; scale -> 2 números flutuantes
	private Double preco;
	
	public Produto() {

	}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
}
