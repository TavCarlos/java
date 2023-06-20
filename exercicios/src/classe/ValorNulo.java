package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!!"));
		/*
		 String é um objeto, logo ele irá apontar para um endereço de memória.
		  */
		
		/*
		 ERROS 
		 
		 ERRO DE COMPILAÇÃO.
		 variáveis, tanto primitivos quanto objetos precisam ser inicializados quando estão
		 no escolpo local. Caso não sejam inicializadas irá dar erro de compilação.
		 (ou seja, não irá conserguir converter um arquivo .java em .class - acontece quando alguma regra da linguagem
		 foi violada);
		 
		 Exemplo:
		 String s2;
		 System.out.println(s2);
		 
		 
		 ERRO DE RUN-TIME
		 Quando um objeto está apontando para algo "nulo", ou seja, no seu endereço de memoria não está
		 apontando para nenhum local. Sendo assim, você não consegue acessar nehum tipo de atributo ou comportamento.
		 
		 Exemplo:
		 String data d1 = null;
		 d1.mes = 3;
		 */
	}
}
