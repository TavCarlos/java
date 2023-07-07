package modelo.muitosparamuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filmes")	
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private Double nota;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "atores_filmes", joinColumns = @JoinColumn(name = "filme_id" , referencedColumnName = "id")
	, inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id"))
	private List<Ator> atores;

	public Filme() {
	
	}
	
	
	public Filme(String nome, Double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public List<Ator> getAtores() {
		if(atores == null) {
			return atores = new ArrayList<>();
		}
		return atores;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
	
	public void adicionarAtores(Ator ator) { //Ao mesmo tempo que adiciona um Ator a um filme, adiciona um filme a aum ator.
		if(ator != null && !getAtores().contains(ator)) {
			getAtores().add(ator);
		
			if(!ator.getFilmes().contains(this)) {
				ator.getFilmes().add(this);
			}
		}
	}
	
	
}

/*JoinTable ->  é usada para especificar os detalhes da tabela de junção que será criada para mapear o relacionamento.

name-> Especifica o nome da tabela de junção.

joinColumns -> Especifica as colunas de junção que fazem referência à entidade atual (a entidade em que a anotação está sendo usada).

inverseJoinColumns -> Especifica as colunas de junção que fazem referência à entidade associada (a entidade do outro lado do relacionamento).*/
