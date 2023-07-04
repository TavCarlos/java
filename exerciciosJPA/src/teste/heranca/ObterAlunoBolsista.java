package teste.heranca;

import java.util.List;

import infra.DAO;
import modelo.heranca.Aluno;

public class ObterAlunoBolsista {

	public static void main(String[] args) {
		
		DAO<Aluno> dao = new DAO<>(Aluno.class);
		
		List<Aluno> alunos = dao.consultar("Aluno.ObterBolsistas", "bolsa", 100);
		
		for(Aluno alunoBolsista: alunos) {
			System.out.println(alunoBolsista.getNome());
		}
		
	}
}
