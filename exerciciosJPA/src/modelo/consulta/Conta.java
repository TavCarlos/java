package modelo.consulta;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/*NamedQuery auxilia na obtenção de consultas estáticas, além de ser melhor no desempenho pois o comando
 * está em jpql. */

@Entity
@NamedQueries({
	@NamedQuery(name = "Conta.ObterAgua", query = "SELECT c FROM Conta c WHERE upper(c.descricao) LIKE upper(:descricao)")
})
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String descricao;
	
	private int valor;

	public Conta() {
	}

	public Conta(String descricao, int valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
}
