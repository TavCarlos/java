package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Essa entidade é mapeada para uma tabela no banco de dados e possui uma correspondência direta com os registros nessa tabela.
public class Usuario {

	@Id //cria uma chave primária na tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) //o banco de dados é responsável por atribuir automaticamente valores.
	private Long id; //cada atributo virará uma coluna no banco de dados
	
	private String nome;
	
	private String email;
	
	
	public Usuario() {
		
	}
	
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	
	public Long getId() {
		return id;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	public void SetId(Long id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setemail(String email) {
		this.email = email;
	}
}
