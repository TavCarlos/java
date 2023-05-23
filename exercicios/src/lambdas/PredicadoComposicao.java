package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		//predicado tem a entrada um parâmetro e retorna um boolean
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isTresDigitos).test(129));
		
		/*
		 .and nesse caso pode ser pensado como: if(isPar == true && isTresDigitos == true)
		 
		 Diferentemente do .andThen na function, ao utilizar o .and, o Predicate utilizar o 
		 .test() como entrada para ambos os métodos.
		 
		 Logo, ele irá checar se 129 é par e 129 tem trÊs digitos.
		 */
		
		System.out.println(isPar.or(isTresDigitos).test(12));
	}
}
