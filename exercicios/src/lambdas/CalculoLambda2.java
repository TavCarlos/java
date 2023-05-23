package lambdas;

import java.util.function.BinaryOperator;

public class CalculoLambda2 {

	public static void main(String[] args) {

		//Double é o tipo de parâmetro que irá receber.
		BinaryOperator<Double> soma = (x , y ) -> {//Operação com dois operandos do mesmo tipo, retorna resultado do mesmo tipo.
			return x + y;
		};
		
		System.out.println(soma.apply(2.0, 3.0));

		
		BinaryOperator<Integer> multiplicar = (x , y) -> x * y; 
		
		System.out.println(multiplicar.apply(2, 3));
		
	}
	
	
	/*
	 No outro exemplo, utilizei Calculo como functionalInterface. Entretanto o Java.util há possue algumas
	 functionsInterfaces prontos. https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
	 
	 Utilizando as functionalInterface já pronta, é necessário colocar o tipo das variáveis.
	 Entretanto não é possível utilizar tipos primitivos, logo deverá utilizar os tipos como Classe. (Integer, Double, Float, ...)
	 
	 No exemplo acima como o número que eu quero colocar é um int, o java não consegue transformar
	 int -> Double.
	 
	 Sendo necessário colocar o .0 atrelado ao número.
	 */
}
