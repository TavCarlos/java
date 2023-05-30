package TratamentoExcecao.personalizadaB;

import TratamentoExcecao.Aluno;

public class Validar {

	private Validar() {}
	
	public static void Aluno(Aluno aluno) throws StringVaziaException, NumeroForaIntervalo {
		//lanço essas duas exceções de forma explícita
		//sendo obrigado também tratar dentro da classe de testeValidacoes.
		
		if(aluno == null) {
			throw new IllegalArgumentException("O Aluno está nulo!");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervalo("nota");
		}
	}
}
