package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		/*BiFunction -> Aceita dois argumento e retorna um valor qualquer, pode escolher os tipos*/
		BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado.apply(6.0, 6.0));
		
		//Ao invés de ter uma função como a de cima, na qual calcula a média e retorna aprovado ou não
		//Posso ter 2 funções que exercem esse mecanismo, sendo assim, é possível utiliza-las em outros momentos
		//Pois não é tão rígida quanto a primeira.
		
		/*No parâmetro do Binary Operator, tanto os dois parâmetros de entrada quanto a retorno terão o mesmo tipo*/
		BinaryOperator<Double> media = (n1 , n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.8 , 5.7));
		
		
		/*Function recebe um parâmetro e retorna um tipo qualquer que você desejar*/
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		/*A entrada do BinaryOperator é um Double e retorna um Double. O parâmetro de entrada da Function é o resultado da saída do
		 BinaryOperator e a saída é uma String.*/
		
		System.out.println(media.andThen(conceito).apply(7.0, 8.0));
	}
}
