package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AB")//valor da coluna discriminadora, é possível saber de qual classe a informação é: AL ->; aluno AB -> bolsista
public class AlunoBolsista extends Aluno {

	private int bolsa;
	
	public AlunoBolsista() {

	}

	public AlunoBolsista(Long matricula, String nome, int bolsa) {
		super(matricula, nome);
		this.bolsa = bolsa;
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
}
