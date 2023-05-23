package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		//Com operador Unário o tipo de parâmetro de entrada será do mesmo tipo do retorno  
		//Com isso, é possível formar uma cadeia de chamadas de métodos.
		
		
		UnaryOperator<Integer> maisDois = num -> num + 2;
		UnaryOperator<Integer> vezesDois = num -> num * 2;
		UnaryOperator<Integer> aoQuadrado = num -> num * num;
		
		
		//Forma de composição de métodos 1
		System.out.println(maisDois.andThen(vezesDois)
				.andThen(aoQuadrado).apply(5));
		
		
		//forma de compsoição de métodos 2
		System.out.println(aoQuadrado.compose(vezesDois).compose(maisDois).apply(5));
		//Compose funciona um pouco diferente, ele vai começar primeiro pelo ultimo método até o primeiro.
	}
}
