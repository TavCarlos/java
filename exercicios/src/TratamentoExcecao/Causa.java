package TratamentoExcecao;

/*
 Uma uma exceção pode ter uma outra causa. Ou seja, uma exceção pode ocasionar outras exceções.
 */

public class Causa {

	public static void main(String[] args) {
		
		try {
			metodoA(null);
		} catch (Exception e) {
			if(e.getCause() != null) { //#4 é verificado se a causa da exceção capturada, 
										//acessada por meio do método getCause(), é diferente de null. (verificando se há causa.)
				System.out.println(e.getCause().getMessage());
			}
		}
		
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno); // #1 Chama o método B
		} catch (Exception e) { //#3 catch pegará o erro do método B e lançará como ''illegalArgumentException''
			throw new IllegalArgumentException(e);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno está NULO."); //#2 como aluno é null lançará esse erro
		}
		
		System.out.println(aluno.nome);
	}
	
}
