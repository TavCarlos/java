package modelo.heranca;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//Cria uma única tabela, juntando a classe pai com a classe filho.
@DiscriminatorColumn(name = "DTYPE", length = 2, discriminatorType = DiscriminatorType.STRING)//cria coluna discriminadora
@DiscriminatorValue("AL")//valor da coluna discriminadora, é possível saber de qual classe a informação é: AL ->; aluno AB -> bolsista
@NamedQueries({
	@NamedQuery(name = "Aluno.ObterBolsistas", query = "SELECT a FROM Aluno a WHERE bolsa >= :bolsa")
})
public class Aluno {
	
	@Id
	private Long matricula;
	
	private String nome;

	public Aluno() {

	}
	
	public Aluno(Long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
