package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		DAO<Aluno> dao = new DAO<>();
		
		Aluno aluno1 = new Aluno(985L, "Leonardo");
		AlunoBolsista aluno2 = new AlunoBolsista(258L, "Maria", 975);
		
		dao.abrirTransacao()
			.incluir(aluno1)
			.incluir(aluno2)
			.fecharTransacao()
			.fechar();
		
		
	}
}
