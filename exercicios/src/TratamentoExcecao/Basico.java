package TratamentoExcecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try { //dentro do par de chaves coloco o código que pode gerar algum tipo de problema.
			ImprimirNomeAluno(a1); //Expection NullPointerException
		} catch(Exception excecao) { //se ocorrer um erro, ele cairá para o catch()
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario.");
		}
		
		try {
			System.out.println(7 / 0); //Exception - ArithmeticException
		} catch (ArithmeticException e) { //utilizando Exption você trata de forma mais genérica, aqui estou sendo mais específico
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}
			System.out.println("Fim!");
	}
	
	public static void ImprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
		
	}
}
