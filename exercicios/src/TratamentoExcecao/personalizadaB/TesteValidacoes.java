package TratamentoExcecao.personalizadaB;

import TratamentoExcecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Maria", -7);
			Validar.Aluno(aluno);
		} catch (StringVaziaException | NumeroForaIntervalo e) {
			System.out.println(e.getMessage());
		}
		
	}
}
