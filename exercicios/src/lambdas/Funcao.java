package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		//Functiion -> Definir o tipo de parâmetro que irá receber e o tipo da resposta.
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 ==  0 ? "Par" : "ímpar";
		
		System.out.println(parOuImpar.apply(5));
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		
		String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(32);
		
		System.out.println(resultadoFinal);
		/*
		 Primeiro irá chamar a FunctionalInterface 'parOuImpar' para o valor '.apply()' e depois chamará 'oResultadoE';
		 
		  Ou seja, primeiro ele resolveu o 'parOuImpar' e o resultado foi passado para 'oResultadoE'.
		  
		  
		  É possível fazer isso pois: na FunctionalInterface 'parOuImpar' entra um inteiro e sai uma String. 
		  na FunctionalInterface entra uma String(que foi o resultado da 'parOuImpar' e sai uma String.)
		  Sendo assim, a saída de um método é a entrada de outro.
		 */
		
		Function<String, String> empolgado = valor -> valor + "!!!!!";
		
		String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(35);
		
		/*
		 parOuImpar.apply(35);
		 AND THEN (com o resultdo de 'parOuImpar')
		 oResultadoE
		 AND THEN (com o resuldado de 'oResultadoE')
		 empolgado
		 
		 */
		
		System.out.println(resultadoFinal1);
		
	}
}
