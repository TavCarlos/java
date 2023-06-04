package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		//com generics
		Caixa<String> caixaA = new Caixa<>(); //fazendo '<String>' ao instânciar Caixa eu defino o valo tipo do "G" 
		caixaA.setCoisa("Segredo!");
		
		String coisaA = caixaA.getCoisa(); //se eu colocar qualquer outro tipo no lugar da string vai da erro de compilação.
		System.out.println(coisaA);
		
		
		//Sem generics
		CaixaSemGenerics caixaB = new CaixaSemGenerics();
		caixaB.setCoisa("Olá");
		
		Double coisaB = (Double) caixaB.getCoisa();
		System.out.println(coisaB);
		//Nesse caso como eu estou trabalhando com o tipo mais genérico(Object)
		//quando eu tento converter com casting o meu atributo(que é uma string), não me da erro de compilação
		//mas quando tentar rodar o código vai me dar uma exceção, podendo gerar um erro para o cliente.
		//Para evitar esse tipo de erro, é melhor utilizar generics.
		
	}
}
