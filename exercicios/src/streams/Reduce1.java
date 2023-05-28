package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
/*
 Reduce você sumariza os elementos que estão apresentados

Com reduce você recebe 2 parâmetros
1 - acumulador
2 - n que representa os elementos dentro da collection.

O tipo que você pode ter como acumulador e como elemento é muito flexível;

Reduce é uma função terminadora, não sendo possível encaderar vários reduces. 
 */
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6 ,7 ,8 , 9);
		
		
		BinaryOperator<Integer> soma = (acumulador, elemento) -> acumulador + elemento;
		
		int total1 = nums.stream()
			.reduce(soma).get();
		//reduce vai gerar um Optional<Integer> e não necessariamente o resultado
		//Com isso, para pegar o resultado é necessário usar o .get() - há outras possibilidades.
		System.out.println(total1);
		
		
		Integer total2 = nums.parallelStream().reduce(100, soma);
		System.out.println(total2);
		//Se antes de passar a função soma no reduce eu colocar um valor inicial (100). 
		//O resultado do reduce não será mais um optional<Integer>, será o próprio inteiro;
		//Nesse caso utilizei Integer pois pode acontece de o reduce retornar null, e uma variável do tipo primitivo não
		//aceita null, ocorrendo erro.
		/*Como foi utilizado parallelStream e criou varias linahs de processamento, ele irá considerar 
		a inicialização 100 para todos os números*/
		
		Integer total3 = nums.stream().reduce(100, soma);
		System.out.println(total3);
		//como há somente uma linha de processamento, ele irá considerar o valor inicial somente uma vez.
		
		
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
		/*
		 Optional -> é uma classe na qual pode ou não pode ter algum valor.
		 Em outra palavras, Optional é como se fosse uma caixa, podendo ter algum objeto dentro ou não.
		 Ou seja, Optional<Integer> pode ter algum valor inteiro dentro ou null. Por isso quando é utilizado somente o
		 reduce, ele tetorna um Optinal.
		 
		 O método ifPresente verifica se há algum valor dentro do Optional que é retornado pelo reduce. Caso há valor
		 ele faz uma determinada ação, caso o valor seja null, ele não fará nada.
		 */
		
	}
}
